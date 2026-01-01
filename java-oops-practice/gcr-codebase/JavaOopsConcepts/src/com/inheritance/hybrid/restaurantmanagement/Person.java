package com.inheritance.hybrid.restaurantmanagement;

public class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
