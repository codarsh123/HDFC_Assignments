package com.rest.webservices.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.webservices.entity.Employee;
import com.rest.webservices.exception.EmployeeNotFoundException;

@Repository
public class EmployeeRepoImp implements IEmployeeRepo {

	@Autowired
	DBUtil util;
	
	
	@Override
	public Employee addEmployee(Employee employee) {

		
			Connection conn = util.getDBConnection();
		
			Employee emp = null;
			
	String query = "insert into employee(eid,ename,salary) values(?,?,?)";
			
	try {
		PreparedStatement pstmt =		conn.prepareStatement(query);
		
			pstmt.setInt(1,employee.getEid() );
			pstmt.setString(2, employee.getEname());
			pstmt.setDouble(3, employee.getSalary());
		
		int count =	pstmt.executeUpdate();
		
			if(count == 0) {
				
				
				throw  new EmployeeNotFoundException();
				
			}
			else {
				
				emp = employee;
				
			}
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (EmployeeNotFoundException e) {
		// TODO Auto-generated catch block
		
		System.err.println("Employee Not Found");
	}
		
		
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {


		Connection conn =	util.getDBConnection();
		
		List<Employee> list = new ArrayList<Employee>();
		
		String query = "select eid,ename,salary from employee";
		
			try {
				PreparedStatement pstmt =	conn.prepareStatement(query);
				
			ResultSet rs = pstmt.executeQuery();
			
					while(rs.next()) {
						
						Employee employee = new Employee();
						
						employee.setEid(rs.getInt("eid"));
						employee.setEname(rs.getString("ename"));
						employee.setSalary(rs.getDouble("salary"));
						
						list.add(employee);
					
						
					}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		return list;
	}

}
