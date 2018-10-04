package aaronarthur.Ch4Examples;

import java.util.Scanner;

public class ComputeAreaIfStatements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// enter the radius of a circle
		
		// Variables
		double radius;
		double area = 0;
		boolean test = true;
		
		// Constants
		final double PI = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679; 
		
		// assign a value to radius
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		
		// Calculate and print area
		if (radius > 0) {
			area = radius*radius*PI;
			
			System.out.println("Area: " + area);
		}
		else {
			System.out.println("The value that you entered for the radius is invalid.");
		}
		
		
		
		
	}

}
