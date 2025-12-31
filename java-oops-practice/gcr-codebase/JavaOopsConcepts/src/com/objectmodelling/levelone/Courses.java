package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Courses {

    String courseName;
    Professor professor;
    ArrayList<Students> students = new ArrayList<>();

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    void addStudent(Students student) {
        students.add(student);
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);

        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        } else {
            System.out.println("Professor: Not Assigned");
        }

        System.out.println("Students:");
        for (Students s : students) {
            System.out.println(s.name);
        }
    }
}





