package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Professor {

    String name;
    ArrayList<Courses> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    void teachCourse(Courses course) {
        courses.add(course);
        course.assignProfessor(this);
    }
}
