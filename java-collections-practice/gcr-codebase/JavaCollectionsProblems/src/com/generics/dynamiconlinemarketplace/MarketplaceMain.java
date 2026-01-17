package com.generics.dynamiconlinemarketplace;

public class MarketplaceMain {

    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        Product<BookCategory> book =
                new Product<>("Atomic Habits", 499, new BookCategory("Self-Help"));

        Product<ClothingCategory> shirt =
                new Product<>("Denim Shirt", 1299, new ClothingCategory("Casual"));

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 24999, new GadgetCategory("Mobile"));

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        applyDiscount(book, 10);
        applyDiscount(phone, 15);

        System.out.println("=== Marketplace Catalog ===");
        catalog.displayCatalog();
    }


    public static <T extends Product<? extends Category>> 
    void applyDiscount(T product, double percentage) {

        double oldPrice = product.getPrice();
        double newPrice = oldPrice - (oldPrice * percentage / 100);
        product.setPrice(newPrice);
    }
}

