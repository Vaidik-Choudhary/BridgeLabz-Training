import java.util.Scanner;

class Calendar {

    // Method to get month name from month number
    public static String getMonth(int num) {
        String month = "";
        switch (num) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid";
                break;
        }
        return month;
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year))
            return 29;

        return days[month - 1];
    }

    // Method to find the first day of the month using Gregorian algorithm
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int monthInput = sc.nextInt();
        int yearInput = sc.nextInt();

   
        System.out.println(getMonth(monthInput) + " " + yearInput);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");


        String month = getMonth(monthInput);
        int daysInMonth = getDaysInMonth(monthInput, yearInput);

        int firstDay = getFirstDay(monthInput, yearInput);
   
        for (int i = 0; i < firstDay; i++)
            System.out.printf("%3s", "");
     
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);

            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }

        sc.close();
    }

}
