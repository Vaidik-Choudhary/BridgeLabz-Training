// Creating FindHandShakes class to compute the number of handshakes
import java.util.Scanner;

class FindHandShakes {

    public static int calculateHandShakes(int n) {
        int handShakes = (n*(n-1))/2;
  
        return handShakes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of peaople : ");
        int n = sc.nextInt();

       // Calling the method to get the number of Handshakes
       int handShakes = FindHandShakes.calculateHandShakes(n);

        // Printing results
        System.out.println(handShakes);


        sc.close();
    }
}   