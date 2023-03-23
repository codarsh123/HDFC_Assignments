package com.rest.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.webservices.entity.Employee;
import com.rest.webservices.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.addEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.getAllEmployees();
	}

	public static boolean isValidEmployee(Employee employee) {

		boolean flag = false;
		
		if (employee.getEid() > 0 && 
					employee.getEname() != null &&
					        employee.getSalary() > 1000)

		{

			flag = true;
			
		}
		
		return flag;

	}

}
