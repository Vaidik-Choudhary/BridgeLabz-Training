package com.encapsulation.librarymanagementsystem;

public class LibraryDriver {
    public static void main(String[] args) {

        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book(1, "Java", "James");
        items[1] = new Magazine(2, "Tech Today", "Editor");
        items[2] = new DVD(3, "AI Movie", "Director");

        for (int i = 0; i < items.length; i++) {
            items[i].getItemDetails();
            System.out.println();
        }
    }
}

