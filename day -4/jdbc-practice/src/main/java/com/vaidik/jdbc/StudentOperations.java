package com.vaidik.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentOperations {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_practice";
        String username = "root";
        String password = "password";
        
//        String sql = "INSERT INTO Student(name,email,age) VALUES(?,?,?)";
//
//        try (
//                Connection con = DriverManager.getConnection(url, username, password);
//                PreparedStatement ps = con.prepareStatement(sql)
//        ) {
//
//            ps.setString(1, "Alice");
//            ps.setString(2, "alice@gmail.com");
//            ps.setInt(3, 21);
//
//            int rows = ps.executeUpdate();
//
//            System.out.println(rows + " row inserted.");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        
        
        

//        String sql = "SELECT * FROM Student Where id = ?";
//
//        try (
//            Connection con = DriverManager.getConnection(url, username, password);
//            PreparedStatement ps = con.prepareStatement(sql);
//        ) {
//        	Scanner sc = new Scanner(System.in);
//        	System.out.print("Enter Student ID: ");
//        	int ids = sc.nextInt();
//        	ps.setInt(1, ids);
//        	
//        	try(ResultSet rs = ps.executeQuery()){
//        	
//
//            while (rs.next()) {
//
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                int age = rs.getInt("age");
//
//                System.out.println(id + " | " + name + " | " + email + " | " + age);
//            }
//        	}
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        
        
        
//        String sql = "SELECT * FROM Student WHERE name = ?";
//        
//        try(
//        	Connection con = DriverManager.getConnection(url,username,password);
//        	PreparedStatement ps = con.prepareStatement(sql);
//        	){
//        		Scanner sc = new Scanner(System.in);
//        		System.out.print("Enter student name: ");
//        		String ioname = sc.nextLine();
//        		ps.setString(1, ioname);
//        	
//        	try(ResultSet rs = ps.executeQuery()){
//        		
//        		if (!rs.next()) {
//        		    System.out.println("Student not found.");
//        		} else {
//        		    do {
//        		        int id = rs.getInt("id");
//        		        String name = rs.getString("name");
//        		        String email = rs.getString("email");
//        		        int age = rs.getInt("age");
//
//        		        System.out.println(id + " | " + name + " | " + email + " | " + age);
//
//        		    } while (rs.next());
//        		}
//        		
//        	}
//        	
//        } catch (SQLException e) {
//        	e.printStackTrace();
//        }
        
        
        
//      String sql = "SELECT * FROM Student WHERE name LIKE ?";
//        
//      try(
//    	Connection con = DriverManager.getConnection(url,username,password);
//    	PreparedStatement ps = con.prepareStatement(sql);
//    	){
//    		Scanner sc = new Scanner(System.in);
//    		System.out.print("Enter student name: ");
//    		String ioname = sc.nextLine();
//    		ps.setString(1, ioname+"%");
//    	
//    	try(ResultSet rs = ps.executeQuery()){
//    		
//    		if (!rs.next()) {
//    		    System.out.println("Student not found.");
//    		} else {
//    		    do {
//    		        int id = rs.getInt("id");
//    		        String name = rs.getString("name");
//    		        String email = rs.getString("email");
//    		        int age = rs.getInt("age");
//
//    		        System.out.println(id + " | " + name + " | " + email + " | " + age);
//
//    		    } while (rs.next());
//    		}
//    		
//    	}
//   	
//    } catch (SQLException e) {
//    	e.printStackTrace();
//    } 
        
        
        
//        String sql = "UPDATE Student SET age = ? WHERE id = ? ";
//        
//        try(
//        	Connection con = DriverManager.getConnection(url,username,password);
//        	PreparedStatement ps = con.prepareStatement(sql)){
//        	Scanner sc = new Scanner(System.in);
//    		System.out.print("Enter student id: ");
//    		int iid = sc.nextInt();
//    		System.out.print("Enter student age: ");
//    		int iage = sc.nextInt();
//    		ps.setInt(1, iage);
//    		ps.setInt(2, iid);
//    		
//    		int rows = ps.executeUpdate();
//    		
//    		System.out.println(rows + "changed");
//        	
//        } catch (SQLException e) {
//        	e.printStackTrace();
//        }
        
        
        
//        String sql = "DELETE FROM Student WHERE id = ?";
//        
//        try(
//           	Connection con = DriverManager.getConnection(url,username,password);
//           	PreparedStatement ps = con.prepareStatement(sql)){
//           	Scanner sc = new Scanner(System.in);
//        	System.out.print("Enter student id: ");
//        	int iid = sc.nextInt();
//        	ps.setInt(1, iid);
//        	
//        	int rows = ps.executeUpdate();
//        	
//        	if (rows > 0) {
//        	    System.out.println("Student deleted successfully.");
//        	} else {
//        	    System.out.println("Student not found.");
//        	}
//        
//        } catch (SQLException e) {
//        	e.printStackTrace();
//        }
//                
        
    }
}