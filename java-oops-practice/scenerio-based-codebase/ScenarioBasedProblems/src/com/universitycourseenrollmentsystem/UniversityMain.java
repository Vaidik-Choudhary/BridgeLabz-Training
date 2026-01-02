package com.universitycourseenrollmentsystem;

public class UniversityMain {

    public static void main(String[] args) {

        Student ug = new Undergraduate(101, "Rahul");
        Student pg = new Postgraduate(102, "Anita", 3.2);

        Course course = new Course(1, "Data Structures");

        Enrollment e1 = new Enrollment(ug, course);
        Enrollment e2 = new Enrollment(pg, course);

        Faculty faculty = new Faculty(1, "Dr. Sharma");

        faculty.assignGrade(e1, 85);
        faculty.assignGrade(e2, 92);

        System.out.println(ug.getTranscript());
        System.out.println(pg.getTranscript());
    }
}

