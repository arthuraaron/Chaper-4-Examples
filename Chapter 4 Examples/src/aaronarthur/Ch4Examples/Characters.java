package aaronarthur.Ch4Examples;

import java.util.Scanner;

public class Characters {

	public static void main(String[] args) {
		/*
		char char1 = 'A';
		char char2 = 'B';
		char char3 = 'a';
		char char4 = 'A';
		char char5 = '1';
		char char6 = '8';
		char char7 = '\u0036';
		char char8 = '\u0037';
		char char9 = '\u0038';
		char char10 = '\u0039';
		
		char A = '\u0041';
		char B = '\u0042';
		char C = '\u0043';
		char D = '\u0044';
		char E = '\u0045';
		char F = '\u0046';
		char G = '\u0047';
		char H = '\u0048';
		char I = '\u0049';
		char J = '\u004A';
		char K = '\u004B';
		char L = '\u004C';
		char M = '\u004D';
		char N = '\u004E';
		char O = '\u004F';
		char P = '\u0050';
		char Q = '\u0051';
		char R = '\u0052';
		char S = '\u0053';
		char T = '\u0054';
		char U = '\u0055';
		char V = '\u0056';
		char W = '\u0057';
		char X = '\u0058';
		char Y = '\u0059';
		char Z = '\u005A';
		
		
		System.out.println(T+""+H+""+I+""+S+" "+I+""+S+" "+T+""+E+""+D+""+I+""+O+""+U+""+S+". "
				+I+" "+A+""+M+" "+D+""+O+""+N+""+E+".");
		
		// Is a < b
		System.out.println(char1 < char2);
		System.out.println(char3 < char4);
		System.out.println(char5 < char6);
		*/
		
		/*
		char ch = '5';
		
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Your character is uppercase.");
		}
		else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Your character is lowercase.");
		}
		else if (ch >- '0' && ch <= '9') {
			System.out.println("Your character is a digit.");
		}
		else {
			System.out.println("Your character is unknown.");
		}
		*/
		
		
		
		// Character Methods (Using dot notation)
		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
		System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));
		System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));
		
		
		
	}

}
