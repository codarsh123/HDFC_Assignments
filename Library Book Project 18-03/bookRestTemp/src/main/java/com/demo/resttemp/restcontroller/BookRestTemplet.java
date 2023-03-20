package com.demo.resttemp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.resttemp.entity.Book;

@RestController
@RequestMapping("/api/rest")
public class BookRestTemplet {

	@Autowired
	RestTemplate resttemp;
	
	String baseUrl="http://localhost:8080/api/books";
	
	@GetMapping("/all")
	public List<Book> getAll(){
		
		List<Book> list = resttemp.getForObject(baseUrl+"/getall", List.class);
		return list;
	}
	
	@PostMapping("/addfromdemo")
	public Book add(@RequestBody Book book) {
		Book bk= resttemp.postForObject(baseUrl+"/add", book, Book.class);
			return bk;
		
	}
}
