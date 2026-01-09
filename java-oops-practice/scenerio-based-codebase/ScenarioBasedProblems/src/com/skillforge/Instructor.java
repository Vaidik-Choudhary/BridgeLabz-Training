package com.skillforge;

public class Instructor extends User {

    public Instructor(String name, int userId) {
        super(name, userId);
    }

    public void uploadCourse(String title) {
        System.out.println("Instructor " + name + " uploaded course: " + title);
    }
}

