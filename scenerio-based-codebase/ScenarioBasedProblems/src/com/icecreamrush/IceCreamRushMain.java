package com.icecreamrush;

public class IceCreamRushMain {

    public static void main(String[] args) {

        FlavorBoard board = new FlavorBoard();

        board.addSales(120);
        board.addSales(90);
        board.addSales(150);
        board.addSales(110);
        board.addSales(80);
        board.addSales(200);
        board.addSales(95);
        board.addSales(130);

        System.out.println("=== Weekly Flavor Popularity ===");

        board.sortSales();
        board.displaySales();
    }
}

