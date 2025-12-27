package com.constructors.levelone;

public class LibraryBookingSystem {

    String title;
    String author;
    double price;
    boolean available;

    public LibraryBookingSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    public void displayBook() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println(available);
    }

    public static void main(String[] args) {
        LibraryBookingSystem b = new LibraryBookingSystem("Lord of the Rings", "R.R Tolkiens", 450);

        b.displayBook();
        b.borrowBook();
        b.displayBook();
    }
}
