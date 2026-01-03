package com.cabbygo;

//Base Vehicle class
public class Vehicle {

 protected String vehicleNumber;
 protected int capacity;
 protected String type;
 protected double ratePerKm;

 // Constructor to initialize vehicle details
 public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
     this.vehicleNumber = vehicleNumber;
     this.capacity = capacity;
     this.type = type;
     this.ratePerKm = ratePerKm;
 }

 // Method to calculate fare
 public double calculateFare(double distance) {
     double baseFare = 50;
     return baseFare + (distance * ratePerKm);
 }

 // Method to display vehicle details
 public void showVehicleDetails() {
     System.out.println("Vehicle Type: " + type);
     System.out.println("Vehicle Number: " + vehicleNumber);
     System.out.println("Capacity: " + capacity);
 }
}
