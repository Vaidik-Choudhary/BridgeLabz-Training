package com.petpal;

import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Pet (1.Dog 2.Cat 3.Bird): ");
        int choice = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        Pet pet;

        if (choice == 1)
            pet = new Dog(name, age);
        else if (choice == 2)
            pet = new Cat(name, age);
        else
            pet = new Bird(name, age);

        pet.makeSound();
        pet.feed();
        pet.play();
        pet.sleep();
        pet.showStatus();

        sc.close();
    }
}
