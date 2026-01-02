package com.universitycourseenrollmentsystem;

public class Faculty {

    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    // Pass/Fail grading style (Polymorphism)
    public void assignGrade(Graded enrollment, double marks) {
        enrollment.assignGrade(marks);
    }
}

