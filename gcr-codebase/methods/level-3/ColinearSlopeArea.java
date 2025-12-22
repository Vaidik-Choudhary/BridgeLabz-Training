import java.util.Scanner;

class ColinearSlopeArea {

    //Method to check whether three points are collinear using slope formula
    public static boolean isCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)
                && (y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1);
    }

    //Method to check whether three points are collinear using area formula
    public static boolean isCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x1 :");
        int x1 = sc.nextInt();
        System.out.print("y1 :");
        int y1 = sc.nextInt();
        System.out.print("x2 :");
        int x2 = sc.nextInt();
        System.out.print("y2 :");
        int y2 = sc.nextInt();
        System.out.print("x3 :");
        int x3 = sc.nextInt();
        System.out.print("y3 :");
        int y3 = sc.nextInt();

        System.out.println("Using Slope Formula: " + isCollinearUsingSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Using Area Formula: " + isCollinearUsingArea(x1, y1, x2, y2, x3, y3));

        sc.close();
    }
}
