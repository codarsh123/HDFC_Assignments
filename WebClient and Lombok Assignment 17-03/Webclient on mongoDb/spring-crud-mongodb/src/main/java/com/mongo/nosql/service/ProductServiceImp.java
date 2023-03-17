package com.mongo.nosql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.nosql.entity.Product;
import com.mongo.nosql.repository.ProductReposotory;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	ProductReposotory repo;

	@Override
	public Product addproduct(Product product) {
		return  repo.save(product);
	}

	@Override
	public Product updateproduct(Product product) {
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProductById() {
		return repo.findAll();
	}

	@Override
	public Product getproductById(int id) {
		return   repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Product> findByPname(String pname) {
		// TODO Auto-generated method stub
		return repo.findByPname(pname);
	}

	@Override
	public List<Product> findByPrice(double price) {
		// TODO Auto-generated method stub
		return repo.findByPrice(price);
	}

	@Override
	public List<Product> findByGT(double price) {
		// TODO Auto-generated method stub
		return repo.findByPriceGreaterThan(price);
	}

}
