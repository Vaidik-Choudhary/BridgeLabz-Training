package com.universitydigitalrecord;

public class UniversityDigitalRecordMain {
	    public static void main(String[] args) {

	        Record tree = new Record();


	        tree.root = tree.insert(tree.root, 50, "Ravi");
	        tree.root = tree.insert(tree.root, 30, "Raghav");
	        tree.root = tree.insert(tree.root, 70, "Saurav");
	        tree.root = tree.insert(tree.root, 20, "Hariom");
	        tree.root = tree.insert(tree.root, 40, "Shivam");

	        System.out.println("Sorted Student Records:");
	        tree.inorder(tree.root);

	        int searchKey = 40;
	        Node result = tree.search(tree.root, searchKey);

	        if (result != null) {
	            System.out.println("\nRecord Found:");
	            System.out.println("Key: " + result.key + " | Data: " + result.data);
	        } else {
	            System.out.println("\nRecord Not Found");
	        }

	        tree.root = tree.delete(tree.root, 30);

	        System.out.println("\nAfter Deleting Key 30:");
	        tree.inorder(tree.root);
	    }
	}
	

