package com.cabbygo;

//RideService class implementing IRideService
public class RideService implements IRideService {

 private Vehicle vehicle;
 private Driver driver;
 private double fare;

 // Constructor to initialize ride service
 public RideService(Vehicle vehicle, Driver driver) {
     this.vehicle = vehicle;
     this.driver = driver;
 }

 // Method to book a ride
 @Override
 public void bookRide(double distance) {
     fare = vehicle.calculateFare(distance);
     System.out.println("Ride Booked Successfully!");
     vehicle.showVehicleDetails();
     driver.showDriverDetails();
     System.out.println("Distance: " + distance + " km");
 }

 // Method to end a ride
 @Override
 public void endRide() {
     System.out.println("Ride Ended.");
     System.out.println("Total Fare: ₹" + fare);
 }
}

