import java.util.Scanner;

class VowelConsonantCount {

    // Method to classify character
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z')
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        return "Not a Letter";
    }

    // Method to count vowels and consonants
    public static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            String t = charType(text.charAt(i));
            if (t.equals("Vowel")) v++;
            if (t.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] res = countVC(text);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);

        sc.close();
    }
}
