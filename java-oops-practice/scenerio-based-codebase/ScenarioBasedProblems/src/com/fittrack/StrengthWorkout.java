package com.fittrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public void calculateCalories() {
        // Strength burns fewer calories per minute
        caloriesBurned = duration * 5.5;
    }
}
