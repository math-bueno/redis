package br.com.original.redistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.original")
public class RedisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisTestApplication.class, args);
	}
	
	

}
