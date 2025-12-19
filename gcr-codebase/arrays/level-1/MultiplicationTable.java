//Creating MultiplicationTable class to print multiplication table
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int[] table = new int[10];

        //Storing multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        //Printing result
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
