package com.fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories() {
        // Cardio burns more calories per minute
        caloriesBurned = duration * 8.5;
    }
}
