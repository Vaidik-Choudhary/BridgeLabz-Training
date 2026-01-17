package com.generics.universitycoursemanagementsystem;

public class ExamCourse extends CourseType {

    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " is evaluated using written exams.");
    }
}

