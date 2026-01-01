package com.encapsulation.ridehailingapplication;

public class RideDriver {
    public static void main(String[] args) {

        Vehicle[] rides = new Vehicle[3];

        rides[0] = new Car("C1", "Amit", 15);
        rides[1] = new Bike("B1", "Rohit", 10);
        rides[2] = new Auto("A1", "Suresh", 12);

        for (int i = 0; i < rides.length; i++) {
            System.out.println("Fare: " +
                rides[i].calculateFare(10));
        }
    }
}

