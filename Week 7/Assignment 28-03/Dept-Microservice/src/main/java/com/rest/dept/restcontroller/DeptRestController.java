package com.rest.dept.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dept.dto.DepartmentDto;
import com.rest.dept.entity.Department;
import com.rest.dept.service.IDepartmentService;

@RestController
@RequestMapping("/api/v1/dept")
public class DeptRestController {
//http://localhost:8282/api/v1/dept
	@Autowired
	IDepartmentService service;
	
	@PostMapping("/add")
	public Department addDept(@RequestBody DepartmentDto dto) {
		
		return service.addDept(dto);
	}
	
	@GetMapping("/get/{id}")
	public Department getDeptById(@PathVariable long id) {
		return service.getDeptById(id);
	}
}
