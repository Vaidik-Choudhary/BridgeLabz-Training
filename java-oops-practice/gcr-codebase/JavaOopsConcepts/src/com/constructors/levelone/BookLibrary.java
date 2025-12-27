package com.constructors.levelone;

public class BookLibrary {
	
	 public String isbn;
	 protected String title;
	 private String author;

	 public BookLibrary(String isbn, String title, String author) {
	     this.isbn = isbn;
	     this.title = title;
	     this.author = author;
	    }

	 public String getAuthor() {
	     return author;
	 }
	 public void setAuthor(String author) {
	     this.author = author;
	 }
}
