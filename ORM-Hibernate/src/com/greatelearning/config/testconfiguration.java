package com.greatelearning.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class testconfiguration {

	public static void main(String args[]) {
		String jdbc = "jdbc:mysql://localhost:3306/gl_database";
		String user = "root";
		String password = "root";
		
		try {
			System.out.println("JDBC url: "+jdbc);
			Connection connection = DriverManager.getConnection(jdbc, user, password);
			System.out.println("Connection Successfull");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
