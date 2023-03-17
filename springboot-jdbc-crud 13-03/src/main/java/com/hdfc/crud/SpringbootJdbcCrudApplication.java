package com.hdfc.crud;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hdfc.crud.repository.DBUtil;

@SpringBootApplication
public class SpringbootJdbcCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcCrudApplication.class, args);
		
			Connection conn = DBUtil.getDBConnection();
			System.out.println(conn);
		
	}

}
