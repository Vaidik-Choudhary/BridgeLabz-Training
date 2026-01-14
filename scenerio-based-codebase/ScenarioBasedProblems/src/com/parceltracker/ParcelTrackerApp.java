package com.parceltracker;

public class ParcelTrackerApp {

	public static void main(String[] args) {
        ParcelLinkedList myParcel = new ParcelLinkedList();
        
        myParcel.trackParcel();

        myParcel.addCheckpointAfter("Shipped", "Regional Sorting Facility");
        
        myParcel.trackParcel();

        Node lostParcel = null; 
        myParcel.checkStatus(lostParcel);
    }

}
