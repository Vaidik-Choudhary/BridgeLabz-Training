package com.inheritance.hybrid.restaurantmanagement;

public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        displayPerson();
        System.out.println("Role: Chef");
        System.out.println("Duty: Cooking food");
    }
}
