package com.vaidik.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/jdbc_practice";
		final String username = "root";
		final String password = "password";
		
		try(Connection con = DriverManager.getConnection(url,username,password)) {
			System.out.println("Connection Successfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
