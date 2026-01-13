package com.traincompanion;

public class Train {

    private Compartment head;
    private Compartment tail;

    public void addCompartment(String name, boolean wifi, boolean pantry) {

        Compartment newCompartment = new Compartment(name, wifi, pantry);

        if (head == null) {
            head = tail = newCompartment;
            return;
        }

        tail.next = newCompartment;
        newCompartment.prev = tail;
        tail = newCompartment;
    }

    public void removeCompartment(String name) {

        Compartment current = head;

        while (current != null) {

            if (current.getName().equalsIgnoreCase(name)) {

                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }

                else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                }

                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                System.out.println("Removed compartment: " + name);
                return;
            }
            current = current.next;
        }

        System.out.println("Compartment not found.");
    }
    
    public void traverseForward() {

        Compartment current = head;

        System.out.println("Forward traversal:");
        while (current != null) {
            System.out.print(current.getName() + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void traverseBackward() {

        Compartment current = tail;

        System.out.println("Backward traversal:");
        while (current != null) {
            System.out.print(current.getName() + " -> ");
            current = current.prev;
        }
        System.out.println("NULL");
    }

    public void showAdjacent(String name) {

        Compartment current = head;

        while (current != null) {

            if (current.getName().equalsIgnoreCase(name)) {

                if (current.prev != null) {
                    System.out.println("Previous: " + current.prev.getName());
                } else {
                    System.out.println("Previous: None");
                }

                if (current.next != null) {
                    System.out.println("Next: " + current.next.getName());
                } else {
                    System.out.println("Next: None");
                }

                return;
            }
            current = current.next;
        }

        System.out.println("Compartment not found.");
    }
}

