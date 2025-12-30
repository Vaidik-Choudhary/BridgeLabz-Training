/*  Rohan wants a fine calculator:
    Input return date and due date.
    If returned late, calculate fine: ₹5/day.
    Repeat for 5 books using for-loop. */

import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int finePerDay = 5;

        System.out.println("==== LIBRARY FINE CALCULATOR ====");

        for (int book = 1; book <= 5; book++) {

            System.out.println("\nBook " + book);

            System.out.print("Enter due date (day): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine Amount : ₹" + fine);
            } else {
                System.out.println("Returned on time");
                System.out.println("Fine Amount : ₹0");
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Thank you");
        sc.close();
    }
}
