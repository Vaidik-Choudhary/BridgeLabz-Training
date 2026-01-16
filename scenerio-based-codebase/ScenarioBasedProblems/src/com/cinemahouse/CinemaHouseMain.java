package com.cinemahouse;

public class CinemaHouseMain {

    public static void main(String[] args) {

        ShowBoard board = new ShowBoard();

        board.addShowTime(18);
        board.addShowTime(14);
        board.addShowTime(20);
        board.addShowTime(10);

        board.sortShowTimes();

        System.out.println("=== Today's Movie Schedule ===");
        board.displayShowTimes();
    }
}

