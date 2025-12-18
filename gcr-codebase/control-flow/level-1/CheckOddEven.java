//Creating CheckOddEven class to check the odd and even numbers till the number
import java.util.Scanner;

class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Taking user input
        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        // checking wether the number is natural or not
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {

              //Running for loop
              for (int i=1; i<=number ; i++) { 
                  if (i % 2 == 0) {
                      System.out.println(i + " : is even");  
                  } else {
                        System.out.println(i + " : is odd");
                  }
              }
        }

        sc.close();

    }
}