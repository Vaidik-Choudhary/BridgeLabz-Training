import java.util.Scanner;

class StringLengthWithoutlength {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without using length() method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}