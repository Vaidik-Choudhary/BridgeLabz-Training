import java.util.Scanner;

class NumberFormatExceptionDemo {

    public static void createNumberFormatException(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    public static void handleNumberFormatException(String text) {
        try {
            createNumberFormatException(text);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        createNumberFormatException(input);
        handleNumberFormatException(input);

        sc.close();
    }
}
