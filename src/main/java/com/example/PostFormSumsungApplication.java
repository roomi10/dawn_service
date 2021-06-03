package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example", "PersonRepository"})
public class PostFormSumsungApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(PostFormSumsungApplication.class, args);
	}

}
