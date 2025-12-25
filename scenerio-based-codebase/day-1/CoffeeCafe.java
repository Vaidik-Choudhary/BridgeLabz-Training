import java.util.Scanner;

class CoffeeCafe {

    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffee;

        while (true) {
            System.out.print("Enter coffee type or exit: ");
            coffee = sc.nextLine();

            if (coffee.equals("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            double price = 0;

            switch (coffee) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Wrong coffee");
                    continue;
            }

            double total = price * qty;
            double gst = total * 0.05;
            double bill = total + gst;

            System.out.println("Final Bill: " + bill);
        }

    }
}
