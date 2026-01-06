package com.petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        System.out.println("Bird is pecking food.");
    }

    @Override
    public void play() {
        changeEnergy(-5);
        changeMood(10);
        System.out.println("Bird is flying.");
    }

    @Override
    public void sleep() {
        changeEnergy(20);
        System.out.println("Bird is resting.");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp Chirp!");
    }
}
