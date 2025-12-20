//Creating ReverseNumber class to reverse a number using array
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        //finding count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int[] reverse = new int[count];

        //storing digits
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        //storing reverse
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[i];
        }

        //Printing reversed number
        for (int i = 0; i < count; i++)
            System.out.print(reverse[i]);

        sc.close();
    }
}
