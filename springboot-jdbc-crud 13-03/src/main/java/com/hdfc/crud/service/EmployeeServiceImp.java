package com.hdfc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.crud.entity.Employee;
import com.hdfc.crud.repository.EmployeeDaoImp;
import com.hdfc.crud.repository.IEmployeeDAO;

@Service
public class EmployeeServiceImp implements IEmployeeService {

		@Autowired
		private  IEmployeeDAO dao;
		
		
	
	@Override
	public int addEmployee(Employee emp) {
		
		
		return dao.addEmployee(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(eid);
	}

	@Override
	public int deleteEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeById(eid);
	}

}
