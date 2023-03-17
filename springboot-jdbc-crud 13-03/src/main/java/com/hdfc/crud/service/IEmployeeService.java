package com.hdfc.crud.service;

import java.util.List;

import com.hdfc.crud.entity.Employee;

public interface IEmployeeService {
	
	

	public  int   addEmployee(Employee emp);
	
	public  int  updateEmployee(Employee emp);
	
	
	public List<Employee>  getAllEmployees();
	

	public Employee  getEmployeeById(int eid);
	
	public int   deleteEmployeeById(int eid);
	

}
