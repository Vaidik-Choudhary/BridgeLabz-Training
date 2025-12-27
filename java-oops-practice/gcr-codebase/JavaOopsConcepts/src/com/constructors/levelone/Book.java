package com.constructors.levelone;

public class Book {

    String title;
    String author;
    double price;

    public Book() {
        this.title = "Iron Man";
        this.author = "Stanley";
        this.price = 1000;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Lord of the Rings" , "R.R Tolkiens", 1500);

        b1.displayBook();
        b2.displayBook();
    }
}
