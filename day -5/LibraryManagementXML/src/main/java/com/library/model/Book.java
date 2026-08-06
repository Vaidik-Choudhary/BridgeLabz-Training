package com.library.model;

public class Book {

    private String title;
    private double price;

    private final Author author;
    private final Publisher publisher;

    public Book(Author author, Publisher publisher) {

        this.author = author;
        this.publisher = publisher;

        System.out.println("Book bean created.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
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