package com.inheritance.multilevel.educationalcourse;

public class CourseDriver {
    public static void main(String[] args) {

        PaidOnlineCourse course =
            new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Coursera",
                true,
                15000,
                20
            );

        course.displayCourseDetails();
    }
}
