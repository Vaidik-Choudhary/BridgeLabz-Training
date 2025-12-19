//Creating OddEvenArray class to store odd and even numbers
import java.util.Scanner;

class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
         System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] odd = new int[number];
        int[] even = new int[number];
        int oddcount = 0, evencount = 0;

        //Running for loop
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[evencount++] = i;
            else
                odd[oddcount++] = i;
        }

        //Printing odd numbers
        for (int i = 0; i < oddcount; i++)
            System.out.println(odd[i] + " ");
  
         System.out.println();

        //Printing even numbers
        for (int i = 0; i < evencount; i++)
            System.out.println(even[i] + " ");

        sc.close();
    }
}
