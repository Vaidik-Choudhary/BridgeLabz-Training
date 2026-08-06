package com.library.model;

public class Author {

    private String name;

    public Author() {
        System.out.println("Author bean created.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Author : " + name);
    }
}