package com.library.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {

    @Value("J. K. Rowling")
    private String name;

    public Author() {
        System.out.println("Author Bean Created");
    }

    public void display() {
        System.out.println("Author : " + name);
    }
}