import java.util.Scanner;

class NumberCheckerVerTwo {

    //Method to find the count of digits in a number and return the count
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    //Method to store digits of a number into an array and return the array
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num = num / 10;
        }
        return digits;
    }

    //Method to find sum of digits using digits array and return the sum
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++)
            sum += digits[i];
        return sum;
    }

    //Method to find sum of squares of digits using Math.pow() and return the sum
    public static int findSumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++)
            sum += Math.pow(digits[i], 2);
        return sum;
    }

    //Method to check whether a number is a Harshad Number and return true or false
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = findSumOfDigits(digits);
        return num % sum == 0;
    }

    //Method to find frequency of each digit and return a 2D array
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + findSumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + findSumOfSquaresOfDigits(digits));
        System.out.println("Harshad Number: " + isHarshadNumber(number, digits));

        int[][] frequency = findDigitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0)
                System.out.println("Digit: " + frequency[i][0] + " Frequency: " + frequency[i][1]);
        }

        sc.close();
    }
}
