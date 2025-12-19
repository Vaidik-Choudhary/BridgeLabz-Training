//Creating LeapYear class to find if the given number is a leap year or not
import java.util.Scanner;

class LeapYear {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter your Year : ");
        int year = sc.nextInt();

        // checking wether the number is natural or not
        if (year < 1582) {
            System.out.println("Enter a bigger number : ");
        } else {
                  if (year % 4 == 0 && year % 100 != 0) {
                      System.out.println("Leap year");
                  } else if ( year % 100 == 0 && year % 400 == 0) {
                        System.out.println("leap year");
                  } else {
                        System.out.println("Not a leap Year");
                  }
              }
         sc.close();
    }
}