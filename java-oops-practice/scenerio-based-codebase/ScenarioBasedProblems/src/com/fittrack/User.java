package com.fittrack;

public class User {

    private String name;
    private int age;
    private double weight; // protected health data
    private String goal;
    private double dailyTarget;

    // Constructor with default goal
    public User(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    // Constructor with custom goal
    public User(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyTarget = 500; // default calorie target
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double computeProgress(double caloriesBurned) {
        return dailyTarget - caloriesBurned; // operator usage
    }

    public void displayProfile() {
        System.out.println("\nUser Profile");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
        System.out.println("Daily Target: " + dailyTarget + " calories");
    }
}
