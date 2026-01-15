package com.eventmanager;

public class EventManagerMain {

	 // Quick Sort method
    public static void quickSort(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tickets, low, high);

            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    private static int partition(Ticket[] tickets, int low, int high) {
        int pivot = tickets[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].price <= pivot) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }

    public static void display(Ticket[] tickets) {
        for (Ticket t : tickets) {
            System.out.print(t.price + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(1500),
            new Ticket(500),
            new Ticket(2500),
            new Ticket(800),
            new Ticket(1200)
        };

        System.out.println("Before Sorting:");
        display(tickets);

        quickSort(tickets, 0, tickets.length - 1);

        System.out.println("After Sorting (Cheapest First):");
        display(tickets);
    }
}
