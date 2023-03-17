package com.hdfc.jdbc.assignment;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hdfc.jdbc.assignment.dao.DBUtil;

@SpringBootApplication
public class SpringJdbcAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcAssignmentApplication.class, args);
		
		 Connection conn = DBUtil.getDBConnection();
		 System.out.println(conn);
	}

}
