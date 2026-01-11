package com.bookshelf;

public class BookMain {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        Book b1 = new Book("1984", "Orwell", "Fiction");
        Book b2 = new Book("The Great Gatsby", "F.Scott", "Fiction");
        Book b3 = new Book("War and Peace", "Leo Tolstoy", "History");

        shelf.addBook(b1);
        shelf.addBook(b2);
        shelf.addBook(b3);
        shelf.addBook(b1);

        shelf.displayCatalog();

        shelf.removeBook(b2);
        shelf.displayCatalog();
    }
}
