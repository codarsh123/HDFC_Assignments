package com.project.part2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.project.part2.entity.User;



@RestController
@RequestMapping("/api/rest")
public class UserController {

	@Autowired
	RestTemplate temp;
	
	String baseUrl="http://localhost:8989/api/users";
	
	@GetMapping("/alluser")
	public List<User> getAll(){
		List<User> list = temp.getForObject(baseUrl+"/getall", List.class);
		return list;
	}
	
	
}
