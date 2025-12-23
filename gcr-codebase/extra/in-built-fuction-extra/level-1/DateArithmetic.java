import java.time.LocalDate;
import java.util.Scanner;

class DateArithmetic {

    // Method to perform date arithmetic operations on user input
    public static LocalDate calculateDate(LocalDate date) {
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);
        return date;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate inputDate = LocalDate.parse(sc.next());

        LocalDate result = calculateDate(inputDate);
        System.out.println("Final Date : " + result);

        sc.close();
    }
}
