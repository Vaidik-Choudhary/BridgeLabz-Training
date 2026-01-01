package com.inheritance.hybrid.restaurantmanagement;

public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        displayPerson();
        System.out.println("Role: Waiter");
        System.out.println("Duty: Serving customers");
    }
}
