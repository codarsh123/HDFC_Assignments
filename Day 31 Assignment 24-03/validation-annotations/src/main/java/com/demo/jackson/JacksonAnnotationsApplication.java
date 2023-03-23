package com.demo.jackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.jackson.entity.Laptop;

@SpringBootApplication
public class JacksonAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JacksonAnnotationsApplication.class, args);
		
		Laptop lap =new Laptop();//normal		
		lap.setId(20);
		lap.setBrand("lenovo");
		lap.setPrice(5200);
		System.out.println(lap);
		
		Laptop lap1 =new Laptop();	//invalid id below 10	
		lap1.setId(2);
		lap1.setBrand("lenovo");
		lap1.setPrice(5200);
		System.out.println(lap1);
		
		Laptop lap2 =new Laptop();	//name  null/empty	
		lap2.setId(20);
		lap2.setBrand("null");
		lap2.setPrice(5200);
		System.out.println(lap);
		
		Laptop lap3 =new Laptop();// invalid price 
		lap3.setId(20);
		lap3.setBrand("lenovo");
		lap3.setPrice(500);
		System.out.println(lap3);
		
	}

}
