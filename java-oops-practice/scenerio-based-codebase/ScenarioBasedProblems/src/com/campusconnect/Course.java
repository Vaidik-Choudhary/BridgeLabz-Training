package com.campusconnect;
import java.util.*;
public class Course {

	public String courseID;
	public String courseName;
	public int duration;
	private Faculty faculty;
	private List<Student> students;
	
	Course(String courseID, String courseName, int duration, Faculty faculty){
		this.courseID = courseID;
		this.courseName = courseName;
		this.duration = duration;
		this.faculty = faculty;
		students = new ArrayList<>();
	}
	
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public void removeStudents(Student student) {
		students.remove(student);
	}
	
	public void showDetails() {
		System.out.println("\nCourse Name               : " + courseName);
		System.out.println("Faculty Name                : " + faculty.name);
		System.out.println("Number of students enrolled : " + students.size());
	}
}
