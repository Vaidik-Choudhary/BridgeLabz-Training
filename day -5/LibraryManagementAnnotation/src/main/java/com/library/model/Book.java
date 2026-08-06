package com.library.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    private final Author author;
    private final Publisher publisher;

    @Value("Harry Potter")
    private String title;

    @Value("699.99")
    private double price;

    public Book(Author author, Publisher publisher) {

        this.author = author;
        this.publisher = publisher;

        System.out.println("Book Bean Created");
    }

    public void display() {
    	
    	System.out.println(" ");
        System.out.println("Book Details");
        System.out.println(" ");
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);

        author.display();
        publisher.display();
    }
}