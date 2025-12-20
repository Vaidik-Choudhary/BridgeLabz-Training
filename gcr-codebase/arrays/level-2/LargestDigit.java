//Creating LargestDigit class to find largest and second largest digit
import java.util.Scanner;

class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //storing digits
        while (number != 0) {
            if (index == maxDigit)
                break;

            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        //finding largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }

        //Printing result
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        sc.close();
    }
}
