package com.rest.webclient.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.rest.webclient.entity.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/webclient")
public class WebClientControllerDemo {

	String baseUrl="http://localhost:8080/api/jdbc";
	
	@GetMapping("/all")
	public Mono<List<Employee>> getAll(){
		
		WebClient webc= WebClient.create(baseUrl);
		
	Flux<Employee> flux =	webc.get()
		.uri("/getall")
		.retrieve()
		.bodyToFlux(Employee.class);
		flux.doOnNext((emp) -> {
			System.out.println(emp);
		});
		Mono<List<Employee>> mono=flux.collectList();
		return mono;
	}
	
	@PostMapping("/add")
	public Mono<String> addEmployee(@RequestBody  Employee employee){						
		WebClient client = WebClient.create(baseUrl);
		Mono<String>  mono = client.post()
								.uri("/add")
								.body(Mono.just(employee), Employee.class)
									.retrieve()
									 .bodyToMono(String.class);
											return mono;
		
		
	}
	
	@PutMapping("/update")
		public Mono<Employee> updateEmployee(@RequestBody Employee employee){
		WebClient wbc = WebClient.create(baseUrl);
		Mono<Employee>  mono = wbc.put().uri("/update"+employee.getEid()).body(Mono.just(employee), Employee.class).retrieve()
								.bodyToMono(Employee.class);
		return mono;
		
	}
	
	@DeleteMapping("/delete/{eid}")	
		public Mono<String> delete(@PathVariable int eid){
		WebClient wbc = WebClient.create(baseUrl);
		Mono<String> response =wbc.delete().uri("/delete/"+eid).retrieve().bodyToMono(String.class);	
		return response;
	}
	
	
	
	
}
