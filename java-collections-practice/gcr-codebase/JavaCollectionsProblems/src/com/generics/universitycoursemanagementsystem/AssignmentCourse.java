package com.generics.universitycoursemanagementsystem;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " is evaluated using assignments.");
    }
}
