package com.addressbooksystem;

public class DigiContactMain {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Bhopal", "MP", "462001");
        Address a2 = new Address("Indore", "MP", "452001");
        Address a3 = new Address("Jaipur", "RJ", "302001");

        Contact c1 = new Contact("Amit", "shah", "9999991111", "amit@gmail.com", a1);
        Contact c2 = new Contact("Rohit", "Sharma", "8888882222", "neha@gmail.com", a2);
        Contact c3 = new Contact("Ravi", "kumar", "7777773333", "ravi@gmail.com", a3);

        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        System.out.println();
        book.displayAllSorted();

        System.out.println();
        book.searchByLocation("MP");

        System.out.println();
        book.editContact("Rohit Sharma", "8888000000", "rohit_new@gmail.com",
                new Address("Indore", "MP", "452010"));

        System.out.println();
        book.deleteContact("Virat Kohli");

        System.out.println();
        book.displayAllSorted();
    }
}

