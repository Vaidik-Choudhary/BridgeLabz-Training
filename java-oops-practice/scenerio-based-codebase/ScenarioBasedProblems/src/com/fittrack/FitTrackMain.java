package com.fittrack;

import java.util.Scanner;

public class FitTrackMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();

        User user = new User(name, age, weight, "Lose Weight");
        user.displayProfile();

        System.out.print("\nEnter workout duration (minutes): ");
        int duration = sc.nextInt();

        // Polymorphism
        Workout workout;

        System.out.print("Choose workout (1.Cardio 2.Strength): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();
        workout.calculateCalories();
        workout.stopWorkout();

        double burned = workout.getCaloriesBurned();
        double remaining = user.computeProgress(burned);

        System.out.println("\nCalories Burned: " + burned);
        System.out.println("Calories remaining to reach target: " + remaining);

        sc.close();
    }
}
