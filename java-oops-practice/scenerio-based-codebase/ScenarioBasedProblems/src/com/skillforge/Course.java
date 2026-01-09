package com.skillforge;

import java.util.Arrays;

public class Course {

    private String title;
    private Instructor instructor;
    private String[] modules;

    private double rating;
    private final String[] reviews;

    private String level;

    // Default modules constructor
    public Course(String title, Instructor instructor, String level) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = new String[]{"Intro", "Basics", "Summary"};
        this.reviews = new String[]{"Great course!"};
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String level, String[] modules) {
        this(title, instructor, level);
        this.modules = modules;
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getLevel() {
        return level;
    }

    public String[] getReviews() {
        return Arrays.copyOf(reviews, reviews.length);
    }

    public void displayCourse() {
        System.out.println("\nCourse: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Level: " + level);
        System.out.println("Modules: " + Arrays.toString(modules));
    }
}
