package com.demo.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.project.entity.Book;
import com.demo.project.exception.BookNotFoundException;
import com.demo.project.repository.BookRepository;
@Service
public class BookServiceImp implements IBookService {

	@Autowired
	BookRepository repo;
	
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) throws BookNotFoundException {
		// TODO Auto-generated method stub
		if(repo.findByTitle(title).isEmpty()) 
			throw new BookNotFoundException();
		
		return repo.findByTitle(title);
	}

}
