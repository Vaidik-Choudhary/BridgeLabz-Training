package com.fittrack;

import java.util.ArrayList;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;
    protected double caloriesBurned;

    // internal logs
    private ArrayList<String> workoutLogs = new ArrayList<>();

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories();

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    protected void addLog(String log) {
        workoutLogs.add(log);
    }

    @Override
    public void startWorkout() {
        addLog("Workout started: " + type);
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        addLog("Workout stopped: " + type);
        System.out.println(type + " workout stopped.");
    }
}
