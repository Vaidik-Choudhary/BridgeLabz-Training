/* 9. School Bus Attendance System Track 10 students' presence.
   Use for-each loop on names.
   Ask "Present or Absent?" 
   Print total present and absent counts. */


import java.util.Scanner;

public class SchoolBusAttendance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {
            "Aman", "Riya", "Karan", "Neha", "Rohit",
            "Pooja", "Ankit", "Sneha", "Rahul", "Simran"
        };

        int p = 0;
        int a = 0;

        System.out.println("==== SCHOOL BUS ATTENDANCE ====");

        for (String name : students) {
            System.out.print(name + " (Present/Absent): ");
            String status = sc.next();

            if (status.equalsIgnoreCase("P")) {
                p++;
            } else {
                a++;
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Total Present : " + p);
        System.out.println("Total Absent  : " + a);
        System.out.println("================================");

        sc.close();
    }
}
