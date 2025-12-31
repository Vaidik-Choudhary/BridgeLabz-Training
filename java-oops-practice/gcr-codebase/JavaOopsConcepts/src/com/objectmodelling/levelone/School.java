package com.objectmodelling.levelone;

import java.util.ArrayList;

public class School {

    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    public static void main(String[] args) {

        School school = new School("ABC School");

        Student s1 = new Student("Rohan");
        Student s2 = new Student("Neha");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.viewCourses();
        c1.showStudents();
    }
}
