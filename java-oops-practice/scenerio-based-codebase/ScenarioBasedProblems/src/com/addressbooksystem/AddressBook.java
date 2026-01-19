package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed: " + contact.getFullName());
                return;
            }
        }

        contacts.add(contact);
        System.out.println("Contact added: " + contact.getFullName());
    }

    public void editContact(String fullName, String phone, String email, Address address) {

        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(fullName)) {
                c.updateContact(phone, email, address);
                System.out.println("Contact updated: " + fullName);
                return;
            }
        }

        System.out.println("Contact not found: " + fullName);
    }

    public void deleteContact(String fullName) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().equalsIgnoreCase(fullName)) {
                contacts.remove(i);
                System.out.println("Contact deleted: " + fullName);
                return;
            }
        }

        System.out.println("Contact not found: " + fullName);
    }

    public void searchByLocation(String location) {

        System.out.println("Search results for: " + location);

        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(location) ||
                c.getAddress().getState().equalsIgnoreCase(location)) {
                c.display();
            }
        }
    }

    public void displayAllSorted() {

        Collections.sort(contacts, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.getFullName().compareToIgnoreCase(c2.getFullName());
            }
        });

        System.out.println("=== Address Book (Sorted) ===");

        for (Contact c : contacts) {
            c.display();
        }
    }
}
