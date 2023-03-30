package com.project.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.project.userapp.entity.User;

public interface IUserService {

	public User registerUser(User user);
	
	public User   updateUser(User user);
	
	public User findByUsername(String username);
	
	public List<User> findAllUsers();
	
	public ResponseEntity<String> deleteUserById(long userId);
	
	public User findByEmail(String email);
}
