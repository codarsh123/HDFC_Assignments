package com.example.producingwebservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.spring.guides.gs_producing_web_service.Employee;
import jakarta.annotation.PostConstruct;

@Component
public class EmployeeRepository {

	private static final Map<Integer, Employee> employees = new HashMap<>();

	@PostConstruct
	public void initEmployeeData() {

		Employee emp1 = new Employee(101, "King", 65000);
		employees.put(emp1.getEid(), emp1);

		Employee emp2 = new Employee(102, "Tom", 45000);
		employees.put(emp2.getEid(), emp2);

		Employee emp3 = new Employee(103, "Smith", 50000);
		employees.put(emp3.getEid(), emp3);

		Employee emp4 = new Employee(104, "Ford", 30000);
		employees.put(emp4.getEid(), emp4);

	}
	Connection conn =DBUtil.getDBConnection();
	public Emp selectById(int eid) {
		String querry="select * from employee where eid=?";
		Emp selectEmp=new Emp() ;
		
		try {
			PreparedStatement pstmt= conn.prepareStatement(querry);
			pstmt.setInt(1, eid);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				selectEmp.setEid(rs.getInt("eid"));
				selectEmp.setFname(rs.getString("fname"));
				selectEmp.setLname(rs.getString("lname"));
				selectEmp.setDept(rs.getString("dept"));
			}
			else {
				System.out.println("Employee not found");				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return selectEmp;
	}

		public int insert(Emp emp) {
		int count=0;
		String querry="insert into employee(eid,fname,lname,dept) values(?,?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(querry);
			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getFname());
			pstmt.setString(3, emp.getLname() );
			pstmt.setString(4, emp.getDept());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;	
	}

		public  int update(Emp emp) {
		int count =0;
		String querry="update employee set fname=?,lname=?,dept=? where eid=?";
		
		try {
			PreparedStatement pstmt=conn.prepareStatement(querry);
			pstmt.setString(1, emp.getFname());
			pstmt.setString(2, emp.getLname());
			pstmt.setString(3, emp.getDept());
			pstmt.setInt(4, emp.getEid());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public int deleteById(int eid) {
		int count=0;
		String querry="delete from employee where eid =?";
		try {
			PreparedStatement pstmt= conn.prepareStatement(querry);
			pstmt.setInt(1, eid);
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}

}
