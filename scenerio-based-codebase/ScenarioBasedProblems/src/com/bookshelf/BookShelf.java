package com.bookshelf;

import java.util.*;

public class BookShelf {

    private HashMap<String, LinkedList<Book>> catalog;
    private HashSet<Book> uniqueBooks;

    public BookShelf() {
        catalog = new HashMap<>();
        uniqueBooks = new HashSet<>();
    }

    public void addBook(Book book) {

        if (uniqueBooks.contains(book)) {
            System.out.println("Duplicate ignored: " + book);
            return;
        }

        uniqueBooks.add(book);

        String genre = book.getGenre();
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);

        System.out.println("Added: " + book);
    }

    public void removeBook(Book book) {

        String genre = book.getGenre();

        if (!catalog.containsKey(genre)) return;

        LinkedList<Book> list = catalog.get(genre);

        if (list.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Removed: " + book);
        }

        if (list.isEmpty()) {
            catalog.remove(genre);
        }
    }

    public void displayCatalog() {

        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  " + book);
            }
        }
    }
}
