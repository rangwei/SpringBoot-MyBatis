package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo3Application {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo (StudentMyBatisRepository repo) {
		return (args) -> {
			logger.info("Student id 10001 -> {}", repo.findById(10001L));
			
			logger.info("All users 1 -> {}", repo.findAll());
			
			logger.info("Inserting -> {}", repo.insert(new Student(10010L, "John", "A1234657")));

			logger.info("Update 10001 -> {}", repo.update(new Student(10001L, "Name-Updated", "New-Passport")));

			repo.deleteById(10002L);

			logger.info("All users 2 -> {}", repo.findAll());

		};
	}
}
