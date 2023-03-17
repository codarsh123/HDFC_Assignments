package com.mongo.nosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCrudMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudMongodbApplication.class, args);
	}

	
	 @Bean
	 public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
