import java.util.Scanner;

class StringIndexOutOfBoundsExceptionDemo {

    public static void stringIndexOutOfBoundsException(String input) {
        System.out.print(input.charAt(input.length()));
    }

    public static void handlestringIndexOutOfBoundsException(String input) {
        try {
            stringIndexOutOfBoundsException(input);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Out Of Bounds Exception :" + e.getMessage()); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        handlestringIndexOutOfBoundsException(input);

       sc.close();
    }
}
    