package com.edumentor;

public class Instructor extends User {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    public void createCourse() {
        System.out.println("Instructor " + name + " has created a new course.");
    }
}
