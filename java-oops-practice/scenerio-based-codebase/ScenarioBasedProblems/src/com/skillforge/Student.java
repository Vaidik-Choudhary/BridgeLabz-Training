package com.skillforge;

public class Student extends User implements ICertifiable {

    private int completedModules;

    public Student(String name, int userId) {
        super(name, userId);
        completedModules = 0;
    }

    public void completeModule() {
        completedModules++;
    }

    public double calculateProgress(int totalModules) {
        return (completedModules * 100.0) / totalModules;
    }

    @Override
    public void generateCertificate(Course course) {
        if (course.getLevel().equalsIgnoreCase("Beginner")) {
            System.out.println("Beginner Certificate awarded to " + name);
        } else if (course.getLevel().equalsIgnoreCase("Advanced")) {
            System.out.println("Advanced Professional Certificate awarded to " + name);
        } else {
            System.out.println("SkillForge Certificate awarded to " + name);
        }
    }
}

