import java.util.Scanner;

class NumberGuessingGame {

    // Method to generate computer guess between low and high
    public static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    // Method to get user feedback
    public static char getFeedback(Scanner sc) {
        return sc.next().charAt(0);
    }

    // Method to adjust range based on feedback
    public static int[] updateRange(int guess, char feedback, int low, int high) {
        if (feedback == 'h') high = guess - 1;
        else if (feedback == 'l') low = guess + 1;
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        char feedback;

        do {
            int guess = generateGuess(low, high);
            System.out.println("Computer Guess: " + guess);
            System.out.print("Enter feedback (h/l/c): ");
            feedback = getFeedback(sc);
            int[] range = updateRange(guess, feedback, low, high);
            low = range[0];
            high = range[1];
        } while (feedback != 'c');

        System.out.println("Number guessed correctly!");

        sc.close();
    }
}
