package com.cabbygo;

//Driver class
public class Driver {

 private String name;
 private String licenseNumber;
 private double rating;

 // Constructor to initialize driver details
 public Driver(String name, String licenseNumber, double rating) {
     this.name = name;
     this.licenseNumber = licenseNumber;
     this.rating = rating;
 }

 // Getter for rating
 public double getRating() {
     return rating;
 }

 // Method to display driver details
 public void showDriverDetails() {
     System.out.println("Driver Name: " + name);
     System.out.println("License Number: " + licenseNumber);
     System.out.println("Rating: " + rating);
 }
}

