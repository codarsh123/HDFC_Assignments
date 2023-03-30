package com.project.part2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/webclient")
public class WebClientController {
	String baseUrl="http://localhost:8989/api/users";
	WebClient client= WebClient.create(baseUrl);
	
//	@GetMapping("/get/{username}")
//	public Mono<String> getByUser(@PathVariable  String username){
//		Mono<String>  mono= client.get().uri("/get/"+username).retrieve().bodyToMono(String.class);
//		return mono;
		
		@GetMapping("/get/{username}")
		public Mono<String> getByUser(@PathVariable String username){
			Mono<String>  mono= client.get().uri("/get/name"+username).retrieve().bodyToMono(String.class);
			return mono;
				
	}
}
