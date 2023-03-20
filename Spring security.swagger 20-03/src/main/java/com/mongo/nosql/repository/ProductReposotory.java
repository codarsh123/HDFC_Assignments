package com.mongo.nosql.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.nosql.entity.Product;

@Repository
public interface ProductReposotory extends MongoRepository<Product, Integer> {

	
	public List<Product>  findByPname(String pname);
	
	public List<Product>  findByPrice(double price);
	
	public List<Product>  findByPriceGreaterThan(double price);
}
