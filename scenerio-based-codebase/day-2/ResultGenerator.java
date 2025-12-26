import java.util.Scanner;

class ResultGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }

        int avg = sum / 5;
        System.out.println("Average: " + avg);

        switch (avg / 10) {
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Grade: D");
        }
    }
}
