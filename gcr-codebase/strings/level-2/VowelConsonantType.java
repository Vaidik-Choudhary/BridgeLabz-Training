import java.util.Scanner;

class VowelConsonantType {

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char) (ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    // Method to find character type for each character
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacterType(text.charAt(i));
        }
        return result;
    }

    // Method to display the 2D array
    public static void displayResult(String[][] data) {
        System.out.println("Character\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = findCharacterTypes(text);
        displayResult(result);

        sc.close();
    }
}
