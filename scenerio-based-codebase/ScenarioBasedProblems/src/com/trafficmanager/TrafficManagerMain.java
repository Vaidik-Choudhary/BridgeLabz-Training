package com.trafficmanager;

public class TrafficManagerMain {
	public static void main(String[] args) {
		Roundabout traffic = new Roundabout();

		System.out.println("Smart Roundabout Traffic Manager");
		traffic.arrive("MP-04-AB-1234");
		traffic.arrive("MP-09-CD-5678");
		traffic.arrive("MP-04-EF-9012");
		traffic.arrive("MP-01-GH-3456");
		traffic.arrive("MP-04-IJ-7890");
		traffic.arrive("MP-09-KL-1122");
		traffic.printState();

		traffic.tryEnter();
		traffic.tryEnter();
		traffic.tryEnter();
		traffic.tryEnter();
		traffic.tryEnter();
		traffic.printState();

		System.out.println("Some vehicles exit");
		traffic.exit("MP-04-AB-1234");
		traffic.exit("MP-04-EF-9012");
		traffic.printState();

		traffic.exit("MP-09-KL-1122");
		traffic.tryEnter();
		traffic.printState();
	}
}