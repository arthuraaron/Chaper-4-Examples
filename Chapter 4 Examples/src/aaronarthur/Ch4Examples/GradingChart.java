package aaronarthur.Ch4Examples;
import java.util.Scanner;


public class GradingChart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Initialize Variables
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		int grade5;
		int grade6;
		int grade7;
		int grade8;
		int grade9;
		int grade10;
		
		double sum;
		double avg;
		String grade = "x";
		
		// Ask for grades
		System.out.println("Enter the first grade: ");
		grade1 = input.nextInt();
		System.out.println("Enter the second grade: ");
		grade2 = input.nextInt();
		System.out.println("Enter the third grade: ");
		grade3 = input.nextInt();
		System.out.println("Enter the forth grade: ");
		grade4 = input.nextInt();
		System.out.println("Enter the fifth grade: ");
		grade5 = input.nextInt();
		System.out.println("Enter the sixth grade: ");
		grade6 = input.nextInt();
		System.out.println("Enter the seventh grade: ");
		grade7 = input.nextInt();
		System.out.println("Enter the eigth grade: ");
		grade8 = input.nextInt();
		System.out.println("Enter the ninth grade: ");
		grade9 = input.nextInt();
		System.out.println("Enter the tenth grade: ");
		grade10 = input.nextInt();
		
		// Calculate sum and average
		sum = grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9 + grade10;
		avg = sum / 10;
		
		// Calculate grade
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else if (avg >= 0) {
			grade = "F";
		}
		else {
			System.out.println("The grade seems to be less than 0. Please try again.");
		}
		
		// Print grade
		if (!grade.equals("x")) {
			System.out.println("The grade is: " + grade);
		}
		
	}

}
