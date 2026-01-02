package com.vehiclerentalapplication;

public class VehicleRentalMain {

    public static void main(String[] args) {

        Rentable bike = new Bike(101, "Yamaha", 300);
        Rentable car = new Car(102, "Honda", 1200);
        Rentable truck = new Truck(103, "Tata", 2000);

        Customer customer = new Customer(1, "Rahul");

        customer.rentVehicle(bike, 3);
        customer.rentVehicle(car, 2);
        customer.rentVehicle(truck, 1);
    }
}

