package com.rest.webservices.service;

import java.util.List;

import com.rest.webservices.entity.Employee;

public interface IEmployeeService {
	
	
	public Employee  addEmployee(Employee employee);
	
	public  List<Employee>  getAllEmployees();
	
	

}
