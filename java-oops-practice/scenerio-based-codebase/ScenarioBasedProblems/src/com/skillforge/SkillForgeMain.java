package com.skillforge;

public class SkillForgeMain {

    public static void main(String[] args) {

        Instructor inst = new Instructor("Vishal", 101);
        inst.uploadCourse("JFS");

        String[] modules = {"OOP", "Collections", "Streams", "Projects"};

        Course course = new Course("JFS",inst,"Advanced",modules);

        course.displayCourse();

        Student student = new Student("Vaidik", 229);

        student.completeModule();
        student.completeModule();
        student.completeModule();

        double progress = student.calculateProgress(course.getTotalModules());
        System.out.println("\nProgress: " + progress + "%");

        if (progress >= 75) {
            student.generateCertificate(course);
        } else {
            System.out.println("Complete more modules to earn certificate.");
        }
    }
}
