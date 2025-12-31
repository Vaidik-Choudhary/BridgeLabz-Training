/* 16. Digital Watch Simulation
   Simulate a 24-hour watch:
   Print hours and minutes in a nested for-loop.
   Use a break to stop at 13:00 manually (simulate a power cut).
   Core Java Scenario-Based Problem Statements */

public class DigitalWatch{

    public static void main(String[] args) {

        System.out.println("=== DIGITAL CLOCK ===");
        for (int i = 0; i<=24; i++ ) {
            if (i == 13) {
                System.out.println("--===== POWER CUT =====--");
                break;
            }
            for (int j = 0; j<=59; j++) {
                System.out.println(" "+ i +" Hours "+ j +" Minutes ");
            }
        }
    }
}    