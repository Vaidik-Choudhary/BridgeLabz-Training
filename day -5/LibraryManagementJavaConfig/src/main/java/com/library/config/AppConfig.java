package com.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.library.model.Author;
import com.library.model.Book;
import com.library.model.Publisher;
import com.library.service.LibraryService;

@Configuration
public class AppConfig {

    @Bean
    public Author author() {

        Author author = new Author();
        author.setName("J. K. Rowling");

        return author;
    }

    @Bean
    public Publisher publisher() {

        Publisher publisher = new Publisher();
        publisher.setName("Penguin Publications");

        return publisher;
    }

    @Bean
    public Book book() {

        Book book = new Book(author(), publisher());

        book.setTitle("Harry Potter");
        book.setPrice(699.99);

        return book;
    }

    @Bean
    public LibraryService libraryService() {

        LibraryService service = new LibraryService();

        service.setBook(book());

        return service;
    }

}