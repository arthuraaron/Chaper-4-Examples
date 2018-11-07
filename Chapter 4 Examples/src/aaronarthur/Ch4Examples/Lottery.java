package aaronarthur.Ch4Examples;

// Aaron Arthur 10/18 Simulates a lottery

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Generate a lottery number
		String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
		

		// Prompt user for guess
		System.out.print("Guess a number for the lottery (2 digits): ");
		String guess = input.nextLine();
		
		// End program if guess isn't 2 digits
		if (guess.length() != 2) {
			System.out.println("Invalid input. ");
			System.exit(1);
		}
		
		// Get digits from lottery
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);
		
		// Get digits from guess
		char guessDigit1 = guess.charAt(0);
		char guessDigit2 = guess.charAt(1);
		
		// Display lottery number
		System.out.println("The lottery number is " + lottery);
		
		// Perfect match
		if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2) {
			System.out.println("Exact match: You win $10,000!! ");
		}
		// Correct digits
		else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
			System.out.println("Match all digits: You win $3,000!! ");
		}
		// One correct digit
		else if ( guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("Match one digit: You win $1,000");
		}
		// No match
		else {
			System.out.println("Sorry, no match");
		}
		
		
	}

}
