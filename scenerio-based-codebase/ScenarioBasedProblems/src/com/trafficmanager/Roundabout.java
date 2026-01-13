package com.trafficmanager;

import java.util.Queue;
import java.util.LinkedList;

class Roundabout {
	private Vehicle head = null;
	private int currentCount = 0;
	private final int MAX_IN_ROUNDABOUT = 5;
	private Queue<Vehicle> waitingQueue = new LinkedList<>();

	void tryEnter() {
		if (waitingQueue.isEmpty()) {
			System.out.println("No vehicles waiting.");
			return;
		}

		if (currentCount >= MAX_IN_ROUNDABOUT) {
			System.out.println("Roundabout full (" + currentCount + "/" + MAX_IN_ROUNDABOUT + ")");
			return;
		}

		Vehicle entering = waitingQueue.poll();
		addToCircularList(entering);
		currentCount++;
		System.out.println("-> " + entering.numberPlate + " entered roundabout");
	}

	void arrive(String numberPlate) {
		Vehicle v = new Vehicle(numberPlate);
		waitingQueue.add(v);
		System.out.println("-> " + numberPlate + " joined waiting queue (queue size: " + waitingQueue.size() + ")");
	}

	void exit(String numberPlate) {
		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		Vehicle current = head;
		Vehicle prev = null;

		do {
			if (current.numberPlate.equals(numberPlate)) {
				if (current == head && current.next == head) {
					head = null;
				} else if (current == head) {
					head = head.next;
					Vehicle last = head;
					while (last.next != current)
						last = last.next;
					last.next = head;
				} else {
					prev.next = current.next;
				}

				currentCount--;
				System.out.println("-> " + numberPlate + " exited roundabout (" + currentCount + " remaining)");
				tryEnter();
				return;
			}

			prev = current;
			current = current.next;
		} while (current != head);

		System.out.println(numberPlate + " not found in roundabout.");
	}

	private void addToCircularList(Vehicle newVehicle) {
		if (head == null) {
			head = newVehicle;
			head.next = head;
			return;
		}

		Vehicle temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		temp.next = newVehicle;
		newVehicle.next = head;
	}

	void printState() {
		System.out.println("\nRoundabout Status");
		System.out.print("Vehicles in roundabout (" + currentCount + "/" + MAX_IN_ROUNDABOUT + "): ");

		if (head == null) {
			System.out.println("(empty)");
		} else {
			Vehicle temp = head;
			do {
				System.out.print("  " + temp.numberPlate);
				temp = temp.next;
				if (temp != head)
					System.out.print(" -> ");
			} while (temp != head);
			System.out.println();
		}

		System.out.println("Waiting queue (queue size: " + waitingQueue.size() + "):");
		if (waitingQueue.isEmpty()) {
			System.out.println("  (empty)");
		} else {
			for (Vehicle v : waitingQueue) {
				System.out.println("  " + v.numberPlate);
			}
		}
		System.out.println();
	}
}