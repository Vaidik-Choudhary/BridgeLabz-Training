// Creating PercentageGrade class to calculate the percentage and grade

import java.util.Scanner;

class PercentageGrade {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter Maths marks : ");
        int mathsMark = sc.nextInt();
        System.out.print("Enter Physics marks : ");
        int physicsMark = sc.nextInt();
        System.out.print("Enter Chemistry marks : ");
        int chemistryMark = sc.nextInt();

        // calculating percentage
        double percent = ((mathsMark + physicsMark + chemistryMark))/3;

       // Checking the grade obtained by the student
       if (percent >= 80 ) {
           System.out.println(percent + "  A (level 4, above agency-normalized standards)");
       } else if (percent <= 79 && percent <= 70) {
             System.out.println(percent + "  B (level 3,at agency-normalized standards)");
       } else if (percent <= 69 && percent <= 60) {
             System.out.println(percent + "  C (level 2,below, but approaching agency-normalized standards)");
       } else if (percent <= 59 && percent <= 50) {
             System.out.println(percent + "  D (level 1,well below agency-normalized standards)");
       } else if (percent <= 49 && percent <= 40) {
             System.out.println(percent + "  E (level 1,too below agency-normalized standards)");
       } else {
             System.out.println(percent + "  R (Remedial Standards)");
       }
       sc.close();
    }
}