package com.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    public void fly() {
        System.out.println(name + " is flying low.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

