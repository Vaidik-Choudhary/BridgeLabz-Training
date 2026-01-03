package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManagementSystem {
    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
        movies.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.9);

        movies.displayForward();
        movies.displayReverse();

        System.out.println("\n--- Search by Director ---");
        movies.searchByDirector("James Cameron");

        System.out.println("\n--- Update Rating ---");
        movies.updateRating("Avatar", 8.0);
        movies.displayForward();

        System.out.println("\n--- Remove Movie ---");
        movies.removeByTitle("Titanic");
        movies.displayForward();
    }
}