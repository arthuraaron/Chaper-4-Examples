package aaronarthur.Ch4Examples;

// Aaron Arthur 10/18 Simulates a lottery

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Generate a lottery number
		int lottery = (int) (Math.random() * 100);
		
		// Prompt user for guess
		System.out.print("Guess a number for the lottery (2 digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess == lottery) {
			System.out.println("Exact match: You win $10,000!!");
		}
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
			System.out.println("Match all digits: You win $3,000!!");
		}
		else if ( guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: You win $1,000");
		}
		else {
			System.out.println("Sorry, no match");
		}
		
		
	}

}
