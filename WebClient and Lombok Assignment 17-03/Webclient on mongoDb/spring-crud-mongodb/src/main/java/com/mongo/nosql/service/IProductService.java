package com.mongo.nosql.service;

import java.util.List;

import com.mongo.nosql.entity.Product;

public interface IProductService {

	
	public Product addproduct(Product product);
	
	public Product updateproduct(Product product);
	
	public List<Product> getAllProductById();
	
	public Product getproductById(int id);
	
	public void deleteById(int id);
	
	public List<Product>  findByPname(String pname);
	
	public List<Product>  findByPrice(double price);
	
	public List<Product>  findByGT(double price);
}
