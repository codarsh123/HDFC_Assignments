package com.project.part2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Project2TempletClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2TempletClientApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplte() {
		
		return new RestTemplate();
	}
}
