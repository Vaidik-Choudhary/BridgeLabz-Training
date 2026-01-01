package com.encapsulation.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {
        System.out.println("DVD reserved");
    }

    public boolean checkAvailability() {
        return false;
    }
}
