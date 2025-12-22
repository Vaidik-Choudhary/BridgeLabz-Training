import java.util.Scanner;

class QuotientRemainder {

    // Method to find remainder and quotient
    public static int[] findQuotientRemainder(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;
        result[1] = number % divisor;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = findQuotientRemainder(number, divisor);
 
        //Printing Results
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);

        sc.close();
    }
}
