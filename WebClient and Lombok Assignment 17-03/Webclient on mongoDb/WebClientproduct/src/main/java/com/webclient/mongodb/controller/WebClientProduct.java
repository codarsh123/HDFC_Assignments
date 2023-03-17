package com.webclient.mongodb.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.webclient.mongodb.entity.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/webproduct")
public class WebClientProduct {

	String baseUrl ="http://localhost:8585/api/products";
	
	@GetMapping("/all")
	public Mono<List<Product>> getAllProduct(){
		WebClient webc= WebClient.create(baseUrl);
		
		Flux<Product> flux = webc.get()
				.uri("/getall").retrieve()
				.bodyToFlux(Product.class);
		
		flux.doOnNext((pro)->{System.out.println(pro);});
		Mono<List<Product>>mono =flux.collectList();
		return mono;
	}
	
	@PostMapping("/add")
	public Mono<Product> addProduct(@RequestBody Product pro){
		WebClient client = WebClient.create(baseUrl);
		Mono<Product> mono=client.post().uri("/add")
				.body(Mono.just(pro), Product.class).retrieve()
				.bodyToMono(Product.class);
		return mono;
	}
	
	@PutMapping("/update")
	public Mono<Product> updateProduct(@RequestBody Product pro){
		WebClient client = WebClient.create(baseUrl);
		Mono<Product> mono=client.put().uri("/update")
				.body(Mono.just(pro), Product.class).retrieve()
				.bodyToMono(Product.class);
		return mono;
	}
	
	@GetMapping("/get/{id}")
	public Mono<Product> getByProductId(@PathVariable int id){
		WebClient client = WebClient.create(baseUrl);
		Mono<Product> mono=client.get().uri("/get/"+id).retrieve().bodyToMono(Product.class);
		return mono;
	}
	
	@DeleteMapping("/delete/{id}")
	public Mono<String> delete(@PathVariable int id){
		WebClient client = WebClient.create(baseUrl);
		Mono<String> mono =client.delete().uri("/delete/"+id).retrieve()
				.bodyToMono(String.class);
		return mono;
	}
		
	
}
