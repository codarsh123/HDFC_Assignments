package com.rest.webservices.repository;

import java.util.List;

import com.rest.webservices.entity.Employee;

public interface IEmployeeRepo {

	
public Employee  addEmployee(Employee employee);
	
	public  List<Employee>  getAllEmployees();
	
}
