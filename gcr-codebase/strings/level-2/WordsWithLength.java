import java.util.Scanner;

class WordsWithLength {

    // Method to find length without length
    public static int findLength(String text) {
        int c = 0;
        try { while (true) { text.charAt(c++); } }
        catch (Exception e) { return c; }
    }

    // Method to split words using charAt
    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') count++;

        String[] words = new String[count];
        int idx = 0, start = 0;

        for (int i = 0; i <= findLength(text); i++) {
            if (i == findLength(text) || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++)
                    w += text.charAt(j);
                words[idx++] = w;
                start = i + 1;
            }
        }
        return words;
    }

    // Method to return word and length as 2D array
    public static String[][] wordsWithLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = wordsWithLength(splitWords(text));

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));

        sc.close();
    }
}
