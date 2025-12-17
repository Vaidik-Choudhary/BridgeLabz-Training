// creating TriangleArea class to find area of a triangle
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input 
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // Calculating area in square inches
        double areaInSqInches = 0.5 * base * height;

        // Converting square inches to square centimeters
        // 1 inch = 2.54 cm → 1 sq inch = 6.4516 sq cm
        double areaInSqCm = areaInSqInches * 6.4516;
	
        // Printing the result
        System.out.println("The area of the triangle in square inches is " + areaInSqInches +" and in square centimeters is " + areaInSqCm);


sc.close();
    }
}