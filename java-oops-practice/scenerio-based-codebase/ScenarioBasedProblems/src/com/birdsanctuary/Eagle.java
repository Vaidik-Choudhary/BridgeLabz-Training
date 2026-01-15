package com.birdsanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    public void fly() {
        System.out.println(name + " is flying high.");
    }
}

