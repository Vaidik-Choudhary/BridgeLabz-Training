import java.util.Scanner;

class NullPointerExceptionDemo {

    public static void nullPointerException() {
        String input = null;
        System.out.print(input.length());
    }

    public static void handleNullPointerException() {
        try {
            nullPointerException();
        }
        catch(NullPointerException e) {
            System.out.println("Null pointer Exception :" + e.getMessage()); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        handleNullPointerException();

       sc.close();
    }
}
    