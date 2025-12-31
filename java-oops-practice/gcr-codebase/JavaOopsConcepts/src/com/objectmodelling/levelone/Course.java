package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Course {

    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

