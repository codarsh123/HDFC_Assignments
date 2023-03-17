package com.hdfc.crud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hdfc.crud.entity.Employee;

@Repository
public class EmployeeDaoImp implements IEmployeeDAO {

	private Connection conn;

	public EmployeeDaoImp() {

		this.conn = DBUtil.getDBConnection();

	}

	@Override
	public int addEmployee(Employee emp) {

		String insertQuery = "insert into employees(eid,ename,salary) values(?,?,?)";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();

		try {
			Statement stmt = conn.createStatement();

			String query = "select eid,ename,salary from employees";

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				Employee emp = new Employee();

				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getDouble("salary"));

				list.add(emp);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public int updateEmployee(Employee emp) {
		String updateQuery = "update  employees  set ename = ? , salary = ? where  eid = ?";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, emp.getEname());
			pstmt.setDouble(2, emp.getSalary());
			pstmt.setInt(3, emp.getEid());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public Employee getEmployeeById(int eid) {

		Employee employee = new Employee();

		String selectOne = "select eid,ename,salary from employees where eid =?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectOne);

			pstmt.setInt(1, eid);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setSalary(rs.getDouble("salary"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employee;

	}

	@Override
	public int deleteEmployeeById(int eid) {
		String deleteOne = "delete from employees where eid =?";

		int count = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteOne);

			pstmt.setInt(1, eid);

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

}
