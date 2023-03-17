package com.mongo.nosql.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mongo.nosql.entity.Product;
@SpringBootTest

class ProductServiceImpTest {

	@Autowired
	IProductService service;
	@Test
	
	void testAddproduct() {
		
		Product product =new Product(115,"car",200000);
		
		service.addproduct(product);
		
		assertEquals(product.getPname(), "car");
	}

	@Test
	
	void testGetAllProductById() {
		
		List<Product> list =service.getAllProductById();
		
		assertTrue(list.size() > 0);
		
		assertNotNull(list);
		
		assertEquals(list.get(0).getId(), 101);
		}

	
	@Test
	void testGetproductById() {


		Product product = service.getproductById(101);
		assertNotEquals(product.getPrice(),300000);
	}

}
