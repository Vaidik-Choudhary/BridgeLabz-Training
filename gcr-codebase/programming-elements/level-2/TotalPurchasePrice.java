// creating TotalPurchasePrice class to calculate total price
import java.util.Scanner;

class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for unit price and quantity
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Printing the result
        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity " + quantity +" and unit price is INR " + unitPrice);

sc.close();
    }
}