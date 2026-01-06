package com.campusconnect;

public class Person {

	protected String name;
	protected String email;
	protected String collegeID;
	
	Person(String name, String email, String collegeID){
		this.name = name;
		this.email = email;
		this.collegeID = collegeID;
	}
	
	public void printDetails() {
		System.out.println("The deatils of persons are as follow");
	}
}
