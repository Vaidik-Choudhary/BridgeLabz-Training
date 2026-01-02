package com.universitycourseenrollmentsystem;

public class Student {

    protected int studentId;
    protected String name;
    private double gpa;

    // Student without elective
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
    }

    // Student with elective
    public Student(int studentId, String name, double initialGpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = initialGpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getTranscript() {
        return "Student ID: " + studentId +
               ", Name: " + name +
               ", GPA: " + gpa;
    }
}

