import java.util.Scanner;

class ShortestLongestWord {

    // Method to find shortest and longest word index
    public static int[] findShortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = min;
        int minI = 0, maxI = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) { min = len; minI = i; }
            if (len > max) { max = len; maxI = i; }
        }
        return new int[]{minI, maxI};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        WordsWithLength w = new WordsWithLength();
        String[][] data = WordsWithLength.wordsWithLength(WordsWithLength.splitWords(text));

        int[] idx = findShortestLongest(data);

        System.out.println("Shortest: " + data[idx[0]][0]);
        System.out.println("Longest: " + data[idx[1]][0]);

        sc.close();
    }
}
