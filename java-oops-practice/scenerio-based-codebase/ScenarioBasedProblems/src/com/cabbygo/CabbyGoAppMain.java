package com.cabbygo;

import java.util.Scanner;

//Main class
public class CabbyGoAppMain {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Vehicle Selection
     System.out.println("Welcome to CabbyGo");
     System.out.println("Select Vehicle Type:");
     System.out.println("1. Mini");
     System.out.println("2. Sedan");
     System.out.println("3. SUV");

     int choice = sc.nextInt();

     Vehicle vehicle;

     if (choice == 1) {
         vehicle = new Mini("CG-MINI-101");
     } else if (choice == 2) {
         vehicle = new Sedan("CG-SEDAN-202");
     } else {
         vehicle = new SUV("CG-SUV-303");
     }

     // Distance Input
     System.out.print("Enter distance (in km): ");
     double distance = sc.nextDouble();

     // System-assigned Driver (Hidden)
     Driver driver = new Driver("System Driver", "AUTO1234", 4.8);

     // Ride Service
     IRideService ride = new RideService(vehicle, driver);
     ride.bookRide(distance);
     ride.endRide();

     sc.close();
 }
}


