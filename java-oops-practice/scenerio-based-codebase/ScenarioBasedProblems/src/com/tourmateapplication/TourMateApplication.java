package com.tourmateapplication;

import java.util.Scanner;

public class TourMateApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Destination: ");
		String destination = input.nextLine();

		System.out.print("Enter Trip Duration (days): ");
		int days = input.nextInt();

		System.out.print("Enter Transport Cost (Rs.): ");
		double tCost = input.nextDouble();

		System.out.print("Enter Hotel Cost (Rs.): ");
		double hCost = input.nextDouble();

		System.out.print("Enter Activity Cost (Rs.): ");
		double aCost = input.nextDouble();

		Transport transport = new Transport(tCost);
		Hotel hotel = new Hotel(hCost);
		Activity activity = new Activity(aCost);

		System.out.println("\nSelect Trip Type:");
		System.out.println("1. Domestic");
		System.out.println("2. International");
		System.out.print("Choice: ");
		int type = input.nextInt();

		Trip trip;
		if (type == 2) {
			trip = new InternationalTrip(destination, days, transport, hotel, activity);
		} else {
			trip = new DomesticTrip(destination, days, transport, hotel, activity);
		}

		trip.book();

		System.out.println("\n--- Trip Summary ---");
		System.out.printf("%-15s %-10s %-12s%n", "Destination", "Days", "Total Budget");
		trip.printTrip();

		input.close();
	}
}
