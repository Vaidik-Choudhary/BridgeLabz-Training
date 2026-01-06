package com.petpal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        changeHunger(-20);
        changeMood(10);
        System.out.println("Dog is eating happily.");
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeMood(20);
        System.out.println("Dog is playing.");
    }

    @Override
    public void sleep() {
        changeEnergy(25);
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}
