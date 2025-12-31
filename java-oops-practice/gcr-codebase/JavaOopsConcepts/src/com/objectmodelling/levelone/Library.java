package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Library {

    String libraryName;
    ArrayList<Book> books = new ArrayList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + libraryName);
        for (Book b : books) {
            b.displayBook();
        }
    }

    // main method inside Library class
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python Guide", "Guido");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b1);

        lib1.showBooks();
        lib2.showBooks();
    }
}
