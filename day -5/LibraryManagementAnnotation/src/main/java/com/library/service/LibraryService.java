package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Book;

@Service
public class LibraryService {

    private Book book;

    public LibraryService() {
        System.out.println("LibraryService Bean Created");
    }

    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }

    public void showBook() {
        book.display();
    }
}