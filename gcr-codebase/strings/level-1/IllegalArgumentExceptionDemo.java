import java.util.Scanner;

class IllegalArgumentExceptionDemo {

    public static void createIllegalArgumentException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            createIllegalArgumentException(text);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        createIllegalArgumentException(input);
        handleIllegalArgumentException(input);

        sc.close();
    }
}
