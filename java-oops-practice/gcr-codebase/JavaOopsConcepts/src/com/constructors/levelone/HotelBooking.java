package com.constructors.levelone;

public class HotelBooking {

    String guestName;
    String roomType;
    int nights;
    
   public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
   public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking hb) {
        guestName = hb.guestName;
        roomType = hb.roomType;
        nights = hb.nights;
    }
   public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking b2 = new HotelBooking(b1);

        b1.displayBooking();
        b2.displayBooking();
    }
}
