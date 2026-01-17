package com.generics.universitycoursemanagementsystem;

public class Course<T extends CourseType> {

    private String courseCode;
    private T courseType;

    public Course(String courseCode, T courseType) {
        this.courseCode = courseCode;
        this.courseType = courseType;
    }

    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        courseType.evaluate();
        System.out.println("-----------------------------------------------------");
    }
}

