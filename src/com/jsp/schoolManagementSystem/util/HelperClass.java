package com.jsp.schoolManagementSystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	
	String url = "jdbc:mysql://localhost:3306/javabatch";
	String username = "root";
	String password = "Sami@1234";
	
	Connection connection = null;
	
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection  = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}

}
