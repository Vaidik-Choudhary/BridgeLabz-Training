/* 13. Sandeep’s Fitness Challenge Tracker 
   Each day, Sandeep completes several push-ups.
   Store counts for a week.
   Use for-each to calculate the total and average.
   Use continue to skip rest days. */

import java.util.Scanner;

public class FitnessChallengeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] pushUpsPerDay = new int[7];

        System.out.println("==== FITNESS CHALLENGE INPUT ====");

        for (int day = 0; day < 7; day++) {
            System.out.print("Enter push-ups for day " + (day + 1) + ": ");
            pushUpsPerDay[day] = sc.nextInt();
        }

        int totalPushUps = 0;
        int activeDays = 0;

        System.out.println("-------------------------------");
        System.out.println("==== FITNESS CHALLENGE REPORT ====");

        for (int pushUps : pushUpsPerDay) {

            // Skip rest days
            if (pushUps == 0) {
                continue;
            }

            totalPushUps = totalPushUps + pushUps;
            activeDays++;
        }

        double average = 0;
        if (activeDays > 0) {
            average = totalPushUps / (double) activeDays;
        }

        System.out.println("Active Days   : " + activeDays);
        System.out.println("Total PushUps : " + totalPushUps);
        System.out.println("Average/Day   : " + average);
        System.out.println("===============================");

        sc.close();
    }
}

  