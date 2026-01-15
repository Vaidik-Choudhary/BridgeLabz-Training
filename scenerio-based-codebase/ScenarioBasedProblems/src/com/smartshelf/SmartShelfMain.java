package com.smartshelf;

public class SmartShelfMain {

    // Insertion Sort by book title
    public static void sortBooks(Book[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }
    public static void display(Book[] books) {
        for (Book b : books) {
            System.out.println(b.getTitle());
        }
    }

    public static void main(String[] args) {

        Book[] books = {
            new Book("Java Programming"),
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Computer Networks")
        };

        System.out.println("Before Sorting:");
        display(books);

        sortBooks(books);

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        display(books);
    }
}