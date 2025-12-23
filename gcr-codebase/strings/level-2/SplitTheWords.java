import java.util.Scanner;

class SplitTheWords {

    // Method to split text into words using charAt()
    public static String[] splitWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') wordCount++;

        String[] words = new String[wordCount];
        int index = 0, start = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++)
                    word += text.charAt(j);
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] manual = splitWords(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison Result: " + (manual.length == builtIn.length));
        sc.close();
    }
}
