package com.library.service;

import com.library.model.Book;

public class LibraryService {

    private Book book;

    public LibraryService() {
        System.out.println("LibraryService Bean Created");
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void showBook() {
        book.display();
    }
}