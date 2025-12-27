package com.constructors.levelone;

public class Ebook extends BookLibrary {

    public Ebook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    public void show() {
        System.out.println(isbn);
        System.out.println(title);
        System.out.println(getAuthor());
    }

    public static void main(String[] args) {
        Ebook e = new Ebook("121", "Lord of the Rings","R.R Tolkiens");
        e.show();
    }
}

