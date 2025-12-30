import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;
        int bookedSeats = 0;
        int choice;

        System.out.println("========= TRAIN RESERVATION SYSTEM =========");

        while (true) {

            if (bookedSeats == totalSeats) {
                System.out.println("\n           All seats are booked!");
                break;
            }

            System.out.println("\n1. Book Ticket");
            System.out.println("2. Show Available Seats");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            System.out.println("--------------------------------------------");

            switch (choice) {

                case 1 -> {
                    bookedSeats++;
                    System.out.println("Ticket Booked Successfully");
                   System.out.println("--------------------------------------------");  
                }

                case 2 -> {
                    System.out.println("Seats Available : " + (totalSeats - bookedSeats));
                    System.out.println("--------------------------------------------");
                }

                case 0 -> {
                    System.out.println("Exiting Reservation System");
                    sc.close();
                    return;
                }

                default -> {
                    System.out.println("Invalid Choice");
                    System.out.println("--------------------------------------------");
                }
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("\n\n============================================");
        System.out.println("Thank you for using Train Reservation System");
        System.out.println("============================================");
        sc.close();
    }
}
