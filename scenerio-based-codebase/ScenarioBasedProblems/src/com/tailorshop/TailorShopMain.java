package com.tailorshop;

public class TailorShopMain {

    public static void main(String[] args) {

        OrderBoard board = new OrderBoard();

        board.addOrder(5);
        board.addOrder(2);
        board.addOrder(8);
        board.addOrder(1);
        board.addOrder(4);

        System.out.println("=== Tailor Shop Orders (Sorted by Deadline) ===");
        board.displayOrders();
    }
}

