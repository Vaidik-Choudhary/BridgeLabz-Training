import java.util.Scanner;

class PalindromeCheck {

    // Method to check palindrome by comparing characters from start and end using loop
    public static boolean isPalindromeUsingLoop(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Recursive method to check palindrome by comparing characters from start and end
    public static boolean isPalindromeUsingRecursion(String input, int start, int end) {
        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return isPalindromeUsingRecursion(input, start + 1, end - 1);
    }

    // Method to reverse a string using charAt() and return character array
    public static char[] reverseString(String input) {
        char[] reverse = new char[input.length()];

        for (int i = 0; i < input.length(); i++)
            reverse[i] = input.charAt(input.length() - 1 - i);

        return reverse;
    }

    // Method to check palindrome using character arrays
    public static boolean isPalindromeUsingArray(String input) {
        char[] original = input.toCharArray();
        char[] reverse = reverseString(input);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("Palindrome using Loop: " + isPalindromeUsingLoop(input));
        System.out.println("Palindrome using Recursion: " + isPalindromeUsingRecursion(input, 0, input.length() - 1));
        System.out.println("Palindrome using Character Array: " + isPalindromeUsingArray(input));

        sc.close();
    }
}
