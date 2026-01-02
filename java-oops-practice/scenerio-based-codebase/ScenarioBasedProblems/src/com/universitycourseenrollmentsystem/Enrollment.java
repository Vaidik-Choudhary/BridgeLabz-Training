package com.universitycourseenrollmentsystem;

public class Enrollment implements Graded {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Letter grading system
    @Override
    public void assignGrade(double marks) {
        double gpa;

        if (marks >= 90)
            gpa = 4.0;
        else if (marks >= 80)
            gpa = 3.5;
        else if (marks >= 70)
            gpa = 3.0;
        else
            gpa = 2.0;

        student.setGpa(gpa);
    }
}
