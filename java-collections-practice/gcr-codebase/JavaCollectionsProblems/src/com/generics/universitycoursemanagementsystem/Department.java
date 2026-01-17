package com.generics.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Course<? extends CourseType>> courses;

    public Department() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            course.displayCourse();
        }
    }
}

