package com.mongo.nosql.controller;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mongo.nosql.entity.Product;

@SpringBootTest

class ProductRestControllerTest {

	@Autowired
	RestTemplate restemp;
	
	
	  @Test void testAddproduct() {
	  
	  
	  Product product =new Product(105, "charger", 400);
	  Product Product1 =restemp.postForObject("http://localhost:8585/api/products/add",product, Product.class);
	  assertNotNull(Product1);
	  
	  }
	 

	@Test
	void testGetproductById() {


		int id =101;
		ResponseEntity<Product> response= restemp.getForEntity("http://localhost:8585/api/products/get/"+id, Product.class);
		System.out.println("lol");
		Product product =response.getBody();
		assertEquals(product.getId(),101);
	}

}
