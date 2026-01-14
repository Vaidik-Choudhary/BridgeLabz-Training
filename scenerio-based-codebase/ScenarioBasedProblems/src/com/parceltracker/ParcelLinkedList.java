package com.parceltracker;

public class ParcelLinkedList {
	private Node head;
	
	public ParcelLinkedList() {
		this.head = new Node("Packed");
		this.head.next = new Node("Shipped");
		this.head.next.next = new Node("In Transit");
		this.head.next.next.next = new Node("Delivered");
	}
	
	public void trackParcel() {
		Node current =head;
		while(current != null) {
			System.out.print("[" + current.data + "]");
			if(current.next != null) {
				System.out.print("->");
			}
			current = current.next;
		}
		System.out.println("\n--------------------------------");
	}
	
	public void addCheckpointAfter(String targetStage, String newCheckpoint) {
        Node current = head;
        while (current != null && !current.data.equalsIgnoreCase(targetStage)) {
            current = current.next;
        }

        if (current != null) {
            Node newNode = new Node(newCheckpoint);
            newNode.next = current.next;
            current.next = newNode;
            System.out.println("Success: Added checkpoint '" + newCheckpoint + "' after " + targetStage);
        } 
        else {
            System.out.println("Error: Stage '" + targetStage + "' not found.");
        }
    }
	
	public void checkStatus(Node currentPoint) {
        if (currentPoint == null) {
            System.out.println("ALERT: Parcel Status is MISSING (Null Pointer detected).");
        } 
        else {
            System.out.println("Current Location: " + currentPoint.data);
        }
    }
}
