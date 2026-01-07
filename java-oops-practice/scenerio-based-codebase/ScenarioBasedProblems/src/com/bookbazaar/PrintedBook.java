package com.bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    public PrintedBook(String title, String author, double price, int stock, boolean offer) {
        super(title, author, price, stock, offer);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;

        if (hasOffer()) {
            total -= 100;
        }
        return total;
    }
}

