import java.util.Scanner;

class SumOfNatural {
 
    // Method to find the sum of natural numbers
    public static int calculateSumOfNatural (int n) {
        int sum=0;
        for (int i = 0;i <= n;i++){
            sum += i;
        }
     return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       // Calling the method
       int sum = SumOfNatural.calculateSumOfNatural(n);
 
       System.out.println(sum);

       sc.close();
    }
}   