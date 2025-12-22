import java.util.Scanner;

public class OTPGenerate {

    //Method to generate a 6 digit random OTP
    public static int randomNumber() {
        int random = (int) (Math.random() * (999999 - 100000) + 1) + 100000;
        return random;
    }

    //Method to check whether all generated OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] optArray = new int[10];
        for (int i = 0; i < 10; i++) {
            optArray[i] = randomNumber();
        }

        boolean unique = areOTPsUnique(optArray);

        if (unique)
            System.out.println("All OTPs are unique");
        else
            System.out.println("Duplicate OTP found");

        sc.close();
    }
}
