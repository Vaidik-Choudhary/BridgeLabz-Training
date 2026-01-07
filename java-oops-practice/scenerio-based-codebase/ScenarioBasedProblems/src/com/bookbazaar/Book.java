package com.bookbazaar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock;        
    private boolean onOffer;

    public Book(String title, String author, double price, int stock) {
        this(title, author, price, stock, false);
    }

    public Book(String title, String author,
                double price, int stock, boolean onOffer) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.onOffer = onOffer;
    }

    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }

    protected boolean hasOffer() {
        return onOffer;
    }

    public double getPrice() {
        return price;
    }

    public abstract double applyDiscount(int quantity);
}


