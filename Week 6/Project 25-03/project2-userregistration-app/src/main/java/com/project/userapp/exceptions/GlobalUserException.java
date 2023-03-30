package com.project.userapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalUserException {

	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<String> userNotFoundExp(){
		return new ResponseEntity<String>("User Not Found!",HttpStatus.NOT_FOUND);
	}
	
}
