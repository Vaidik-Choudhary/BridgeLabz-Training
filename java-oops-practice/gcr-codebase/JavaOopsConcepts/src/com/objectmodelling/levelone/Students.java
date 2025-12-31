package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Students {

    String name;
    ArrayList<Courses> courses = new ArrayList<>();

    public Students(String name) {
        this.name = name;
    }

    void enrollCourse(Courses course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Courses c : courses) {
            System.out.println(c.courseName);
        }
    }

    public static void main(String[] args) {

        Students s1 = new Students("Rahul");
        Students s2 = new Students("Neha");

        Professor p1 = new Professor("Dr. Verma");

        Courses c1 = new Courses("AI");
        Courses c2 = new Courses("ML");

        p1.teachCourse(c1);
        p1.teachCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.viewCourses();
        c1.showCourseDetails();
    }
}




