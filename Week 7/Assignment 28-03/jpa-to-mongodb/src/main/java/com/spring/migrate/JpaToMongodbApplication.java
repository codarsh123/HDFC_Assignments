package com.spring.migrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JpaToMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaToMongodbApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplet() {
		return new RestTemplate();
	}
}
