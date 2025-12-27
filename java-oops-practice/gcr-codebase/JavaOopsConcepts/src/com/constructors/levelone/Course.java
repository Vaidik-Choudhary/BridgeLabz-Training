package com.constructors.levelone;

public class Course {

    String courseName;
    int duration;
    double fee;
    static String instituteName = "Techno Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee);
        System.out.println(instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c = new Course("Java", 6, 12000);
        c.displayCourseDetails();
    }
}

