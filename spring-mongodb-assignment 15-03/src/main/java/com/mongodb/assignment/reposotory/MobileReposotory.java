package com.mongodb.assignment.reposotory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.mongodb.assignment.entity.Mobile;

@Repository
public interface MobileReposotory extends MongoRepository<Mobile, Integer> {

	
	public List<Mobile> findByBrand(String brand);
}
