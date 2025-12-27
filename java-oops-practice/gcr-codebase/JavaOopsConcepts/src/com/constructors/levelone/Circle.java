package com.constructors.levelone;
import java.util.Scanner;
public class Circle {
    double radius;
    
    public Circle() {
    	this(1.0);
    }
    public Circle(double radius) {
    	this.radius = radius;
    }
	public void displayradius() {
		System.out.println("The radius of circle : "+ radius);
	}
	public static void main(String[] args) {
		Circle radi1 = new Circle();
		radi1.displayradius();
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		Circle radi2 = new Circle(radius);
		radi2.displayradius();	
		sc.close();
	}
}
