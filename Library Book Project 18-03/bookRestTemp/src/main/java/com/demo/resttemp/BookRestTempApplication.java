package com.demo.resttemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookRestTempApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRestTempApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplte() {
		
		return new RestTemplate();
	}
}
