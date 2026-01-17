package com.generics.universitycoursemanagementsystem;

public class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " is evaluated using research papers.");
    }
}

