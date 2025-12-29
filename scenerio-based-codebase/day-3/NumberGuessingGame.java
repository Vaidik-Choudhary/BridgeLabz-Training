/* 7. The Number Guessing Game 
   A game asks the player to guess a number between 1 and 100.
   Core Java Scenario Based Problem Statements
   Use do-while loop.
   Give hints like "Too high" or "Too low".
   Count attempts and exit after 5 wrong tries */

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("========================================");
        System.out.println("          NUMBER GUESSING GAME          ");
        System.out.println("========================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("Maximum Attempts : 5");
        System.out.println("----------------------------------------");
        System.out.println("Attempt     Guess       Hint");
        System.out.println("----------------------------------------");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            String hint;

            if (guess > secretNumber) {
                hint = "Too High";
            } else if (guess < secretNumber) {
                hint = "Too Low";
            } else {
                hint = "Correct";
            }

            // Manual spacing for table-like output
            System.out.println(attempts + "           " + guess + "          " + hint);

            if (guess == secretNumber) {
                break;
            }

        } while (attempts < maxAttempts);

        System.out.println("----------------------------------------");

        if (guess == secretNumber) {
            System.out.println("Congratulations! You Won!");
        } else {
            System.out.println("Game Over!, Correct Number : " + secretNumber);
        }

        System.out.println("========================================");
        sc.close();
    }
}
