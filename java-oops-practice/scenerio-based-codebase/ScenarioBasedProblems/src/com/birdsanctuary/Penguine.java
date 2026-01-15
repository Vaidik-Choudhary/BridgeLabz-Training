package com.birdsanctuary;

public class Penguine extends Bird implements Swimmable {

    public Penguine(String name, String id) {
        super(name, "Penguin", id);
    }

    public void swim() {
        System.out.println(name + " is swimming fast.");
    }
}

