import java.util.Scanner;

class CharsInString {

    // Method to convert string into char array manually
    public static char[] manualCharsInString(String input) {
        char[] manually = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            manually[i] = input.charAt(i);
        }
        return manually;
    }

    // Method to convert string into char array using toCharArray()
    public static char[] usingToCharArray(String input) {
        char[] usingMethod = input.toCharArray();
        return usingMethod;
    }

    // Method to compare both the character arrays
    public static boolean compareStrings(char[] manually, char[] usingMethod) {
        if (manually.length != usingMethod.length)
            return false;

        for (int i = 0; i < manually.length; i++) {
            if (manually[i] != usingMethod[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char[] manually = manualCharsInString(input);
        char[] usingMethod = usingToCharArray(input);

        if (compareStrings(manually, usingMethod))
            System.out.println("The Strings are equal");
        else
            System.out.println("The Strings are not equal");

        sc.close();
    }
}
