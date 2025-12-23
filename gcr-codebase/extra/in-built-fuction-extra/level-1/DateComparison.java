import java.time.LocalDate;
import java.util.Scanner;

class DateComparison {

    // Method to compare two dates
    public static void compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isBefore(d2)) {
            System.out.println("First date is before second date");
        } else if (d1.isAfter(d2)) {
            System.out.println("First date is after second date");
        } else {
            System.out.println("Both dates are the same");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date1 = LocalDate.parse(sc.next());
        LocalDate date2 = LocalDate.parse(sc.next());

        compareDates(date1, date2);

        sc.close();
    }
}
