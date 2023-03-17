package com.hdfc.jdbc.assignment.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static Connection conn = null;
	
	public static Connection getDBConnection() {

		

		// step1 register driver
		try {
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver"); String url =
			 * "jdbc:mysql://localhost:3306/hdfc_emp"; String username = "root"; String
			 * password = "admin";
			 */

			FileReader fr = new FileReader("src/main/resources/application.properties");

			Properties prop = new Properties();

			prop.load(fr);

			String driver = prop.getProperty("driver.classname");

			
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

}
