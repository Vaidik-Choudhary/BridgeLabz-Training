package com.library.model;

public class Publisher {

    private String name;

    public Publisher() {
        System.out.println("Publisher bean created.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Publisher : " + name);
    }
}