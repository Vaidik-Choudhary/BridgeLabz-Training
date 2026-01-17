package com.artexpo;

public class ArtExpoMain {

    public static void main(String[] args) {

        RegistrationBoard board = new RegistrationBoard();

        board.addRegistrationTime(930);
        board.addRegistrationTime(900);
        board.addRegistrationTime(945);
        board.addRegistrationTime(915);

        System.out.println("=== Sorted Artist Registration Times ===");
        board.displayBoard();
    }
}

