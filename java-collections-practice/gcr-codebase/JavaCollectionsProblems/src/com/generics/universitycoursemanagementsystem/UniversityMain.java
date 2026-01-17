package com.generics.universitycoursemanagementsystem;

public class UniversityMain {

    public static void main(String[] args) {

        Department csDepartment = new Department();

        Course<ExamCourse> ds =
                new Course<>("CS101", new ExamCourse("Data Structures"));

        Course<AssignmentCourse> se =
                new Course<>("CS102", new AssignmentCourse("Software Engineering"));

        Course<ResearchCourse> ai =
                new Course<>("CS103", new ResearchCourse("AI Research"));

        csDepartment.addCourse(ds);
        csDepartment.addCourse(se);
        csDepartment.addCourse(ai);

        System.out.println("=== CS Department Courses ===\n");
        csDepartment.displayCourses();
    }
}

