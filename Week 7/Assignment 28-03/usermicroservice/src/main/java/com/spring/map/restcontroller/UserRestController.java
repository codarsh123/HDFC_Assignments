package com.spring.map.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.map.dto.UserDTO;
import com.spring.map.entity.User;
import com.spring.map.service.IUserService;
import com.spring.map.vo.Department;
import com.spring.map.vo.UserDept;

@RestController
@RequestMapping("/api/v2/users")
public class UserRestController {
//http://localhost:8181/api/v2/users
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public User addUser(@RequestBody  UserDTO dto) {
		return service.addUser(dto);
	}
	
	@GetMapping("/get/{uid}")
	public User getUserById(@PathVariable long uid) {
		return service.getUserById(uid);
	}
	
	@GetMapping("/get/userwithdept/{uid}")
	public UserDept getUserByIdWithDept(@PathVariable long uid) {
		return service.getUserByIdWithDept(uid);
	}
	
	@PostMapping("/add/dept")
	public Department addDept( @RequestBody Department dept) {
		return service.addDept(dept);
	}
}
