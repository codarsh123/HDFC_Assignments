package com.rest.webservices.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservices.entity.Employee;
import com.rest.webservices.service.EmployeeServiceImp;
import com.rest.webservices.service.IEmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {

	
	@Autowired
	IEmployeeService service;
		
	
	@PostMapping(value="/add/xml",consumes = "application/xml",produces = "application/xml")
	public Employee  addEmployee(@Valid @RequestBody Employee employee) {
		
		return service.addEmployee(employee);
		
		
	}
	
	
	@GetMapping(value="/getall",produces = "application/xml")
	public List<Employee>  getAll(){
		
		
		return service.getAllEmployees();
		
	}
	
	
	
}
