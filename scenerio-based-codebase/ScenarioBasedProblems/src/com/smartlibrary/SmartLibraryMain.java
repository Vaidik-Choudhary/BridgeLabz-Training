package com.smartlibrary;

public class SmartLibraryMain {

    public static void main(String[] args) {

        BorrowList list = new BorrowList();

        list.addBook("Data Structures");
        list.addBook("Algorithms");
        list.addBook("Computer Networks");
        list.addBook("Operating Systems");
        list.addBook("Java Programming");

        System.out.println("=== Borrowed Books (Alphabetical Order) ===");
        list.displayBooks();
    }
}

