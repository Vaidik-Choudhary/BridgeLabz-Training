package com.generics.universitycoursemanagementsystem;

public abstract class CourseType {

    protected String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract void evaluate();
}

