import java.util.Scanner;

class KiloMeterToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance ");
        double km = sc.nextDouble();

        double mile = km * 0.621371;
        System.out.println("Distance in mile = " + mile);

}
}