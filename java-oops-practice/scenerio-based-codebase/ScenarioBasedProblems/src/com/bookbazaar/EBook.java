package com.bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    public EBook(String title, String author, double price, int stock, boolean offer) {
        super(title, author, price, stock, offer);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;

        if (hasOffer()) {
            total -= total * 0.20;
        }
        return total;
    }
}
