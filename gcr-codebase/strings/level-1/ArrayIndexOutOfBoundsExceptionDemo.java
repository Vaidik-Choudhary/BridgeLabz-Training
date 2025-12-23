import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionDemo {

    public static void createArrayIndexOutOfBoundsException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            createArrayIndexOutOfBoundsException(names);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++)
            names[i] = sc.next();

        createArrayIndexOutOfBoundsException(names);
        handleArrayIndexOutOfBoundsException(names);

        sc.close();
    }
}
