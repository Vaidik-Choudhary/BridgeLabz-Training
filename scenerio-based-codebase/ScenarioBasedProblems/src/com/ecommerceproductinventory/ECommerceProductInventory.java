package com.ecommerceproductinventory;

public class ECommerceProductInventory {

	    public static void main(String[] args) {

	        Inventory inventory = new Inventory();

	        inventory.root = inventory.insert(inventory.root, 105, "Laptop", 55000);
	        inventory.root = inventory.insert(inventory.root, 101, "Smartphone", 25000);
	        inventory.root = inventory.insert(inventory.root, 110, "Headphones", 3000);
	        inventory.root = inventory.insert(inventory.root, 103, "Keyboard", 1500);
	        inventory.root = inventory.insert(inventory.root, 108, "Monitor", 12000);

	        int searchSKU = 103;
	        ProductNode result = inventory.search(inventory.root, searchSKU);

	        if (result != null) {
	            System.out.println("Product Found:");
	            System.out.println("SKU: " + result.key + " | Name: " + result.name + " | Price: ₹" + result.price);
	        } else {
	            System.out.println("Product Not Found");
	        }

	        int updateSKU = 110;
	        double newPrice = 2800;

	        if (inventory.updatePrice(updateSKU, newPrice)) {
	            System.out.println("\nPrice Updated Successfully for SKU " + updateSKU);
	        } else {
	            System.out.println("\nSKU Not Found for Price Update");
	        }

	        System.out.println("\nSorted Product List (By SKU):");
	        inventory.inorder(inventory.root);
	    }
}


