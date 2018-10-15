package aaronarthur.Ch4Examples;

// Aaron Arthur 10/18 Switch statments (Special if statments)

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		/*
		  switch (switch-expression) {
		  case value1: 
		  	Statements;
		  	break;
		  case value2:
		  	Statements;
		  	break;
		  case value3:
		  	Statements;
		  	break;
		  case value4:
		  	Statements;
		  	break;
		  default:
		  	Statements;
		  	break;
		  	
		  }
		 */
		
		// Get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year you were born: ");
		int year = input.nextInt();
		
		// Switch statement
		switch (year % 12) {
		case 0:
			System.out.println("Monkey");
			System.out.println("Cangeability without being constant leads to foolishness. ");
			System.out.println("Attribute: Changeability ");
			break;
		case 1:
			System.out.println("Rooster");
			System.out.println("Being constant without changeability leads to woodenness. ");
			System.out.println("Attribute: Being consant ");
			break;
		case 2: 
			System.out.println("Dog");
			System.out.println("Fidelity wihtout amiability leads to rejection. ");
			System.out.println("Attribute: Fidelity ");
			break;
		case 3:
			System.out.println("Pig");
			System.out.println("Amiability wihtout fidelity leads to immorality. ");
			System.out.println("Attribute: Amiability ");
			break;
		case 4:
			System.out.println("Rat");
			System.out.println("Wisdom without industriousness leads to triviality. ");
			System.out.println("Attribute: Wisdom ");
			break;
		case 5:
			System.out.println("Ox");
			System.out.println("Industriousness wihtout wisdom leads to futility. ");
			System.out.println("Attribute: Industriousness ");
			break;
		case 6:
			System.out.println("Tiger");
			System.out.println("Valor without caution leads to recklessness. ");
			System.out.println("Attribute: Valor ");
			break;
		case 7:
			System.out.println("Rabbit");
			System.out.println("Caution without valor leads to cowardice. ");
			System.out.println("Attribute: Caution ");
			break;
		case 8:
			System.out.println("Dragon");
			System.out.println("Strength without flexibility leads to fracture. ");
			System.out.println("Attribute: Strength ");
			break;
		case 9:
			System.out.println("Snake");
			System.out.println("Flexibility without strength leads to compromise. ");
			System.out.println("Attribute: Flexibility ");
			break;
		case 10:
			System.out.println("Horse");
			System.out.println("Forging ahead without unity leads to abandonment. ");
			System.out.println("Attribute: Forging ahead ");
			break;
		case 11:
			System.out.println("Goat");
			System.out.println("Unity without forging ahead leads to stagnation. ");
			System.out.println("Attribute: Unity ");
			break;
			
		}
		

	}

}
