package com.objectmodelling.levelone;

public class Customers {

    String name;

    public Customers(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Customers c = new Customers("Amit");

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        System.out.println("Products ordered by " + c.name + ":");
        order.showProducts();
    }
}
