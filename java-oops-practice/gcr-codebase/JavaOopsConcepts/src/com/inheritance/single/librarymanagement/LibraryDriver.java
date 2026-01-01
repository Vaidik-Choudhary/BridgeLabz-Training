package com.inheritance.single.librarymanagement;

public class LibraryDriver {
    public static void main(String[] args) {

        Author book =
            new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java programming"
            );

        book.displayInfo();
    }
}

