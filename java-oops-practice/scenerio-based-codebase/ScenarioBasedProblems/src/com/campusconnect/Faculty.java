package com.campusconnect;

public class Faculty extends Person {

	protected int age;
	
	Faculty(String name, String email, String facID, int age){
		super(name, email, facID);
		this.age = age;
	}
	
	@Override
	public void printDetails() {
		System.out.println("The Details of the faculty as follow : ");
		System.out.println("Name       : " + name);
		System.out.println("Email      : " + email);
		System.out.println("Faculty ID : " + collegeID);
		System.out.println("Age        : " + age);
	}
}