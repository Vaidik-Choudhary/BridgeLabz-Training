import java.util.Scanner;

class NumberCheckerVerThree {

    // Method to count number of digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Method to store digits of a number into an array
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    // Method to check whether the number is a Palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check whether the number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++)
            if (digits[i] != 0)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Palindrome Number: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));

        sc.close();
    }
}
