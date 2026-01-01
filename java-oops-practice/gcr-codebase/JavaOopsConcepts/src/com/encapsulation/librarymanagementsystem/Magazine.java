package com.encapsulation.librarymanagementsystem;

public class Magazine extends LibraryItem {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

