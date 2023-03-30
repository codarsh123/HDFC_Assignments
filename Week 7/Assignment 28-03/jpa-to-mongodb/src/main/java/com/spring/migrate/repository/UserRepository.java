package com.spring.migrate.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.migrate.entity.User;
@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
