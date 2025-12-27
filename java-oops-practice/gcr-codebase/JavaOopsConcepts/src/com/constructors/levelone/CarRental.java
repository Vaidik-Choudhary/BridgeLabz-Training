package com.constructors.levelone;

import java.util.Scanner;
public class CarRental {

	 String customerName, carModel;
	 int rentalDays;
	
	 String[] carsTypes = {"Sedan", "MUV", "SUV", "hatchback"};
	 int[] prices = {1000,800,1200,600};
	
	public CarRental(String customerName, String carModel, int renetalDays ) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = renetalDays;
	}
	 public int calculatePrice(String carName, int days) {
		 for ( int i = 0; i < carsTypes.length; i++) {
			  if ( carsTypes[i].equals(carName))
				  return  days * prices[i];
		 }
		 return -1;
	 }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter car type (Sedan, MUV, SUV, hatchback : ");
		String carType = sc.nextLine();	
		System.out.print("Enter no. of days ");
		int days = sc.nextInt();
		CarRental car1 = new CarRental(name,carType, days);
		int rentAmount = car1.calculatePrice(car1.carModel, car1.rentalDays);
		if ( rentAmount== -1)
			System.out.println("No car available");
		else
			System.out.println(car1.customerName + ": Your total Amount : " + rentAmount);
		
		sc.close();
	}
}