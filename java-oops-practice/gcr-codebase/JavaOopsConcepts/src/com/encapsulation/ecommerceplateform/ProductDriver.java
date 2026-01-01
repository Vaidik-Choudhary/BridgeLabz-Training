package com.encapsulation.ecommerceplateform;

public class ProductDriver {
    public static void main(String[] args) {

        Product[] products = new Product[3];

        products[0] = new Electronics(1, "Laptop", 60000);
        products[1] = new Clothing(2, "Shirt", 2000);
        products[2] = new Groceries(3, "Rice", 1500);

        for (int i = 0; i < products.length; i++) {
            double tax = 0;

            if (products[i] instanceof Taxable) {
                tax = ((Taxable) products[i]).calculateTax();
            }

            products[i].displayProduct();
            System.out.println("Final Price: " +
                products[i].getFinalPrice(tax));
            System.out.println();
        }
    }
}
