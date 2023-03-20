package com.demo.project.controller;

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

import com.demo.project.entity.Book;
import com.demo.project.exception.BookNotFoundException;
import com.demo.project.service.IBookService;

@RestController
@RequestMapping("/api/books")
public class BookRestController {

	@Autowired
	IBookService service;
	
	@PostMapping("/add")
	public Book addbook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@PutMapping("/update")
	public Book updatebook(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
	@GetMapping("/getall")
	public List<Book> getAllBook(){
		return service.getAllBooks();
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		service.deleteById(id);
		return  new ResponseEntity<String>("Record Deleted ",HttpStatus.OK);
	}
	
	@GetMapping("/get/{title}")
	public List<Book> findByTitle(@PathVariable String title ) throws BookNotFoundException {
		return service.getBookByTitle(title);
				
	}

}
