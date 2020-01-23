package br.com.original.RedisController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.Jedis;

@RestController
@RequestMapping("/redis")
public class RedisController {

	@GetMapping(value = "/test")
	@ResponseBody
	public ResponseEntity<String> Test () throws Exception {
		
		
		Jedis jedis = new Jedis("localhost");
		
		jedis.set("tutorial-name", "Redis tutorial"); 
		
		System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));
		
//		  jedis.lpush("tutorial-list", "Redis"); 
//	      jedis.lpush("tutorial-list", "Mongodb"); 
//	      jedis.lpush("tutorial-list", "Mysql");
//	      
//	      List<String> list = jedis.lrange("tutorial-list", 0 ,5); 
//	      
//	      for(int i = 0; i<list.size(); i++) { 
//	         System.out.println("Stored string in redis:: "+list.get(i)); 
//	      } 
		
		
		return new ResponseEntity<>("OK",HttpStatus.OK);
	}
	
	
}
