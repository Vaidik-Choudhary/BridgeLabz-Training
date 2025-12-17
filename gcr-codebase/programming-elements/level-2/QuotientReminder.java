// Creating QuotientReminder class to find the quotient and reminders of two numbers
import java.util.Scanner;

class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Calculation
        int quotient = number1 / number2;
        int reminder = number1 % number2;

        // printing Result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);

sc.close();
    }
}
