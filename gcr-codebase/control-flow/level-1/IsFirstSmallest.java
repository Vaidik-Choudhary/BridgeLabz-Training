// Creating IsFirstSmallest class to find if the first element is the smallest 
import java.util.Scanner;

class IsFirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int number2 = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int number3 = sc.nextInt();

        // Checking If the first element is the smallest 
        if (number1<number2 && number1<number3) {
            System.out.print("Is the first number the smallest? Yes");
        } else {
              System.out.print("Is the first number the smallest? No");
        }

        sc.close();
    }
}