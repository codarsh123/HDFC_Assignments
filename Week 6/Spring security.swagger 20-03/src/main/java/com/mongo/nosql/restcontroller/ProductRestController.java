package com.mongo.nosql.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.nosql.entity.Product;
import com.mongo.nosql.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	IProductService service;
	
	//http://localhost:8585/api/products
	@PostMapping("/add")
	public Product addproduct(@RequestBody Product product) {
		return service.addproduct(product);
	}
	
	@PutMapping("/update")
	public Product updateproduct(@RequestBody Product product) {
		return service.updateproduct(product);
	}
	
	@GetMapping("/getall")
	public List<Product> getAllProductById(){
		
		return service.getAllProductById();
	}
	
	@GetMapping("/get/{id}")
	public Product getproductById( @PathVariable int id) {
		return service.getproductById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		service.deleteById(id);
		return  new ResponseEntity<String>("Record Deleted ",HttpStatus.OK);
		
	}
	
	@GetMapping("/getbyname/{pname}")
	public List<Product>  findByPname(@PathVariable String pname){
		return service.findByPname(pname);
	}
	
	@GetMapping("/getbyprice/{price}")
	public List<Product>  findByPrice(@PathVariable Double price){
		return service.findByPrice(price);
	}
	
	@GetMapping("/getbyprice/gt/{price}")
	public List<Product>  findByGT(@PathVariable double price){
		return service.findByGT(price);
	}

}
