package com.birdsanctuary;

public abstract class Bird {

    protected String name;
    protected String species;
    protected String id;

    public Bird(String name, String species, String id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getId() {
        return id;
    }

    public void display() {
        System.out.println(name + " | " + species + " | ID: " + id);
    }
}
