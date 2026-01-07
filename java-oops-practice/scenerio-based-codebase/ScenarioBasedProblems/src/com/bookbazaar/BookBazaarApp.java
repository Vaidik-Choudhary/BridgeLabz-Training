package com.bookbazaar;

public class BookBazaarApp {

    public static void main(String[] args) {

        User user = new User("U101","Vaidik","Vaidik@gmail.com");

        Book book1 = new EBook("Java Basics","James Gosling",500,50,true);

        Book book2 = new PrintedBook("OOP Concepts","Herbert Schildt",700,30,true);

        Order order = new Order(user);

        order.addBook(book1, 2);
        order.addBook(book2, 1);

        order.placeOrder();

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Total Cost: " + order.calculateTotal());
    }
}
