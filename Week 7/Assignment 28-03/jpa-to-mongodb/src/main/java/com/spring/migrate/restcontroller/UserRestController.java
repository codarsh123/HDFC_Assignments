package com.spring.migrate.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.migrate.dto.UserDTO;
import com.spring.migrate.entity.User;
import com.spring.migrate.service.IUserService;
import com.spring.migrate.vo.Department;
import com.spring.migrate.vo.UserDept;

@RestController
@RequestMapping("/api/v3/users")
public class UserRestController {
//http://localhost:8383/swagger-ui
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public User addUser(@RequestBody UserDTO dto ) {
		return service.addUser(dto);		
	}
	
	@GetMapping("/get/{uid}")
	public User getUserById(@PathVariable long uid) {
		return service.getUserById(uid);
	}
	////http://localhost:8383/api/v3/users/get/userwithdept/5
	@GetMapping("/get/userwithdept/{uid}")
	public UserDept getUserByIdWithDept(@PathVariable long uid) {
		return service.getUserByIdWithDept(uid);
	}
	
	@PostMapping("/add/dept")
	public Department addDept( @RequestBody Department dept) {
		return service.addDept(dept);
	}
}
