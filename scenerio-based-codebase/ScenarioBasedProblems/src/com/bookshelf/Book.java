package com.bookshelf;

public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;

        return title.equals(other.title) && author.equals(other.author) && genre.equals(other.genre);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() + genre.hashCode();
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}


