package com.ambulanceroute;

public class AmbulanceRoute {

    private class Node {
        private String unit;
        private Node next;

        private Node(String unit) {
            this.unit = unit;
        }
    }

    private Node head;
    private Node tail;

    public void addUnit(String unit) {
        Node newNode = new Node(unit);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void rotate(int steps) {

        if (head == null) return;

        Node temp = head;
        for (int i = 0; i < steps; i++) {
            temp = temp.next;
        }

        System.out.println("Redirecting to: " + temp.unit);
    }

    public void removeUnit(String unit) {

        if (head == null) return;

        Node curr = head;
        Node prev = tail;

        do {
            if (curr.unit.equals(unit)) {

                if (curr == head) head = head.next;
                if (curr == tail) tail = prev;

                prev.next = curr.next;
                tail.next = head;

                System.out.println("Unit removed: " + unit);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    public void displayRoute() {

        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.unit + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}

