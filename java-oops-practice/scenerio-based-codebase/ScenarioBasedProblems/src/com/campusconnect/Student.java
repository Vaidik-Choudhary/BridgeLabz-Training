package com.campusconnect;

import java.util.*;

public class Student extends Person implements ICourseAction {

	protected int age;
	Course course;
	char gender;
	private Map<Course, Double> grades;
	private List<Course> courseList;
	
	Student(String name, String email, String collegeID, int age, char gender, Course course){
		super(name, email, collegeID);
		this.age = age;
		this.gender = gender;
		this.course = course;
		grades = new HashMap<>();
		courseList = new ArrayList<>();
	}
	
	@Override
	public void printDetails() {
		System.out.println("The Details of the student as follow : ");
		System.out.println("Name       : " + name);
		System.out.println("Email      : " + email);
		System.out.println("College ID : " + collegeID);
		System.out.println("Age        : " + age);
		System.out.println("Gender     : " + gender);
		System.out.println("Course     : " + course.courseName);
		System.out.println("GPA        : " + calculateGPA());
	}

	@Override
	public void enrollCourse(Course course) {
	        courseList.add(course);
	        grades.put(course, 0.0);
	        course.addStudents(this);
	        System.out.println("Student enrolled in: " + course.courseName);
	}

	@Override
	public void dropCourse(Course course) {
	        courseList.remove(course);
	        grades.remove(course);
	        course.removeStudents(this);
	        System.out.println("Student dropped: " + course.courseName);
    }

	public void assignGrade(Course course, double grade) {
	        if (grades.containsKey(course)) {
	            grades.put(course, grade);
	        }
	}

	private double calculateGPA() {
        double total = 0;

        for (double grade : grades.values()) {
            total += grade;
        }

        return grades.isEmpty() ? 0.0 : total / grades.size();
    }
	
}

