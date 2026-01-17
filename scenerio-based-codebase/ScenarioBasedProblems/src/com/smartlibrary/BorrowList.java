package com.smartlibrary;

import java.util.ArrayList;
import java.util.List;

public class BorrowList {

    private List<String> bookTitles;

    public BorrowList() {
        bookTitles = new ArrayList<>();
    }

    public void addBook(String title) {

        int i = bookTitles.size() - 1;
        bookTitles.add("");

        while (i >= 0 && bookTitles.get(i).compareToIgnoreCase(title) > 0) {
            bookTitles.set(i + 1, bookTitles.get(i));
            i--;
        }

        bookTitles.set(i + 1, title);
    }

    public void displayBooks() {
        for (String book : bookTitles) {
            System.out.println("Book: " + book);
        }
    }
}

