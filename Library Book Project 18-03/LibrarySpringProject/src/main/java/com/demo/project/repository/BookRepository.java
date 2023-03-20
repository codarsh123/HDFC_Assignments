package com.demo.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.project.entity.Book;
@Repository
public interface BookRepository  extends MongoRepository<Book,Integer>{

	public List<Book> findByTitle(String title);
	
}
