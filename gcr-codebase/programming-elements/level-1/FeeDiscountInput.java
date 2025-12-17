// creating FeeDiscountInput class to calculate discount
import java.util.Scanner;

class FeeDiscountInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking user input
    double fee = sc.nextDouble();
    double discountPercent = sc.nextDouble();

    // Calculating discount amount and finalfee
    double discount = (fee * discountPercent) / 100;
    double finalFee = fee - discount;

    // Printing the result
    System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

sc.close();
    }
}