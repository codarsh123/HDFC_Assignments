package com.demo.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExpController {

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<String> bookNotFoundExp(){
		
		return new ResponseEntity<String>("Book Not Found!",HttpStatus.NOT_FOUND);
		
	}
}
