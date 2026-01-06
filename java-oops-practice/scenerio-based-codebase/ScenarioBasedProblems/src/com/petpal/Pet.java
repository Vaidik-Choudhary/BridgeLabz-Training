package com.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger; // encapsulated
    private int energy;
    private int mood;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        hunger = r.nextInt(50) + 30;
        energy = r.nextInt(50) + 30;
        mood = r.nextInt(50) + 30;
    }

    protected void changeHunger(int value) {
        hunger += value;
    }

    protected void changeEnergy(int value) {
        energy += value;
    }

    protected void changeMood(int value) {
        mood += value;
    }

    public void showStatus() {
        System.out.println("\nPet Status");
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    public abstract void makeSound();
}

