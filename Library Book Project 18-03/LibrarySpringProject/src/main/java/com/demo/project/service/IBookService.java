package com.demo.project.service;

import java.util.List;

import com.demo.project.entity.Book;
import com.demo.project.exception.BookNotFoundException;

public interface IBookService {

	public Book addBook(Book book);
	
	public Book updateBook(Book book);
	
	public List<Book> getAllBooks();
	
	public void deleteById(int id);
	
	public List<Book> getBookByTitle(String title) throws BookNotFoundException;

}
