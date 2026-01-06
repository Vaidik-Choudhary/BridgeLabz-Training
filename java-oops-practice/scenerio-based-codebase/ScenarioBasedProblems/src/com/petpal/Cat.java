package com.petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        System.out.println("Cat is eating quietly.");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeMood(15);
        System.out.println("Cat is playing.");
    }

    @Override
    public void sleep() {
        changeEnergy(30);
        System.out.println("Cat is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

