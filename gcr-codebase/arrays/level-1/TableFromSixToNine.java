//Creating TableFromSixToNine class to print multiplication table from 6 to 9
import java.util.Scanner;

class TableFromSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];

        //Storing multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        //Printing result
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}
