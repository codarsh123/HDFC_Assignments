package com.project.userapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.userapp.entity.User;
@Repository
public interface UserRepository extends MongoRepository<User,Long> {

	public User findByUsername(String username);
	
	public User findByEmail(String email);
}
