import java.util.Scanner;

class VotingEligibility {

    // Method to take age input of students
    public static int[] getStudentAges(int n, Scanner sc) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }
        return result;
    }

    // Method to display the 2D array
    public static void displayResult(String[][] data) {
        System.out.println("Age\tVoting Status");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ages = getStudentAges(n, sc);
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);

        sc.close();
    }
}
