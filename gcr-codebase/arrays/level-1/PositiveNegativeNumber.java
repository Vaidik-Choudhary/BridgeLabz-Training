//Creating PositiveNegativeNumber class to analyze numbers in an array
import java.util.Scanner;

class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Defining array of 5 elements
        int[] numbers = new int[5];

        //taking user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }

        //Checking numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }

        //Comparing first and last element
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
