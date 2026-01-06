package com.campusconnect;
import java.util.*;
public class CampusConnectMain {

	public static void main(String[] args) {
		System.out.println("====================Welcome to Campus Connect======================\n");
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Student Email : ");
		String email = sc.nextLine();
		System.out.print("Enter Student College ID : ");
		String rollNo = sc.nextLine();
		System.out.print("Enter Student Gender : ");
		char gender = sc.next().charAt(0);
		System.out.print("Enter Student age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Course ID : ");
		String courseID = sc.nextLine();
		System.out.print("Enter Course Name : ");
		String courseName = sc.nextLine();
		System.out.print("Enter Duration of Course : ");
		int duration = sc.nextInt();
		Faculty faculty = new Faculty("Dr. Sharma","sharma@123.com", "9123TIT456", 45);
		Course course = new Course(courseID, courseName, duration , faculty);
		Student student = new Student(name,email, rollNo, age, gender, course);
		student.enrollCourse(course);
		
		System.out.print("Enter Grade for " + courseID + ": ");
        double grade = sc.nextDouble();
        student.assignGrade(course, grade);
        
		System.out.println("\n------------------- Student Details --------------------\n");
		student.printDetails();
		System.out.println("\n------------------- Faculty Details --------------------\n");
		faculty.printDetails();
		System.out.println("\n------------------- Course Details ---------------------\n");
		course.showDetails();
		System.out.println("\n====================Thank You for Campus Connect===================");
		
		sc.close();
	}

}
