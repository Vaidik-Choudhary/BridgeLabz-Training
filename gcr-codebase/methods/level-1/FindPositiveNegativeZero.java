import java.util.Scanner;

class FindPositiveNegativeZero {
 
    // Method to find if the number is positive negative or zero
    public static void calculatePositiveNegativeZero(int n) {
        if (n>0) System.out.println("1");
        else if (n<0) System.out.println("-1");
        else System.out.println("0");
   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       // Calling the method
 FindPositiveNegativeZero.calculatePositiveNegativeZero(n);

        sc.close();
    }
}   