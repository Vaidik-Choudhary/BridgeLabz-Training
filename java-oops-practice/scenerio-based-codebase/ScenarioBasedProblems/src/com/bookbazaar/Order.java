package com.bookbazaar;

import java.util.ArrayList;

public class Order {

    private User customer;               
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();

    private String orderStatus;           

    public Order(User customer) {
        this.customer = customer;
        this.orderStatus = "CREATED";
    }

    public void addBook(Book book, int quantity) {
        if (book.isAvailable(quantity)) {
            books.add(book);
            quantities.add(quantity);
            book.reduceStock(quantity);
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < books.size(); i++) {
            total += books.get(i)
                    .applyDiscount(quantities.get(i));
        }
        return total;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    protected void updateStatus(String status) {
        orderStatus = status;
    }

    public void placeOrder() {
        updateStatus("PLACED");
        System.out.println(
            "Order placed for " + customer.getName()
        );
    }
}

