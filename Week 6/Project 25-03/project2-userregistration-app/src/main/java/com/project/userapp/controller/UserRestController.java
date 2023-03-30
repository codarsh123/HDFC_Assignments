package com.project.userapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.userapp.entity.User;
import com.project.userapp.exceptions.UserNotFound;
import com.project.userapp.service.IUserService;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

	//http://localhost:8989/swagger-ui.html
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public User addUser(@Valid @RequestBody User user) {
		return service.registerUser(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user){
		return service.updateUser(user);
	}
	
	@GetMapping(value="/getall",produces= "application/xml")
	public List<User> getAllUsers(){
		return service.findAllUsers();
	}
	
	@GetMapping("/get/name/{username}")
	public User findByUsername(@PathVariable String username) throws UserNotFound {
		
		
		User user = service.findByUsername(username);
		if(user == null) {
			throw new UserNotFound();
		}
		return user;
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable long userId) throws UserNotFound{
		
		ResponseEntity<String> deleted = service.deleteUserById(userId);
		if(deleted == null) {
			throw new UserNotFound();
		}
		return deleted;
	}
	
	@GetMapping("/get/email/{email}")
	public User findByEmail(@PathVariable String email) {
		return service.findByEmail(email);
	}
}
