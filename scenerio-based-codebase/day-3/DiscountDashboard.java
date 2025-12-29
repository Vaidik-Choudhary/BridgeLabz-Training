/*8. Shopkeeper’s Discount Dashboard A shopkeeper gives discounts based on total bill:
  Input item prices in a for-loop.
  Use if-else for discount logic.
  Use proper indentation, constants, and comments.*/


import java.util.Scanner;

public class DiscountDashboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double discount20 = 0.20;
        double discount10 = 0.10;

        double total = 0;
        double discount = 0;

        System.out.println("===== SHOP BILL SYSTEM =====");

        System.out.print("Enter number of items: ");
        int items = sc.nextInt();

        for (int i = 1; i <= items; i++) {
            System.out.print("Enter price of item " + i + ": ");
            total = total + sc.nextDouble();
        }

        if (total >= 5000) {
            discount = total * discount20;
        } else if (total >= 3000) {
            discount = total * discount10;
        } else {
            discount = 0;
        }

        double finalAmount = total - discount;

        System.out.println("----------------------------");
        System.out.println("Total Bill    : " + total);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Amount  : " + finalAmount);
        System.out.println("============================");

        sc.close();
    }
}
