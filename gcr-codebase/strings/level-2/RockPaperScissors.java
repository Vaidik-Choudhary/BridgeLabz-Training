import java.util.Scanner;

class RockPaperScissors {

    // Method to get computer choice
    public static int computerChoice() {
        return (int)(Math.random() * 3);
    }

    // Method to find winner
    public static int findWinner(int u, int c) {
        if (u == c) return 0;
        if ((u == 0 && c == 2) || (u == 1 && c == 0) || (u == 2 && c == 1)) return 1;
        return -1;
    }

    // Method to calculate stats
    public static String[][] stats(int user, int comp, int total) {
        String[][] s = new String[2][3];
        s[0] = new String[]{"User", String.valueOf(user), String.valueOf(user * 100 / total)};
        s[1] = new String[]{"Computer", String.valueOf(comp), String.valueOf(comp * 100 / total)};
        return s;
    }

    // Method to display results
    public static void display(String[][] s) {
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i][0] + "\t" + s[i][1] + "\t" + s[i][2] + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int user = 0, comp = 0;

        for (int i = 0; i < games; i++) {
            int u = sc.nextInt();
            int c = computerChoice();
            int r = findWinner(u, c);
            if (r == 1) user++;
            if (r == -1) comp++;
        }
        display(stats(user, comp, games));

        sc.close();
    }
}
