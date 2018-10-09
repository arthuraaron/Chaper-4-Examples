package aaronarthur.Ch4Examples;

// Aaron Arthur 10/18 An addition game

import java.util.Scanner;

public class AdditionGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Put the whole thing into a loop
		
		int loop = 0;
		while (loop == 0) {
			
			// Initialize variables and set them to their values
			
			int num1;
			num1 = (int) (Math.random() * 10);
			
			int num2; 
			num2 = (int) (Math.random() * 10);
			
			int correctAnswer = num1 + num2;
			int userAnswer;
			
			// Display question to user
			
			System.out.print("What is " + num1 + " + " + num2 + ": ");
			userAnswer = input.nextInt();
			
			// Output the correct answer
			
			if (userAnswer == correctAnswer) {
				System.out.println("Correct!\n");
			}
			else {
				System.out.println("Incorrect! The correct answer is: " + correctAnswer + "\n");
			}
		
		}
		
	}

}
