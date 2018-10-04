package aaronarthur.Ch4Examples;

public class NestedIfStatements {

	public static void main(String[] args) {
		
		// Initialize variables
		int x = 1;
		int y = -2;
		int z = 3;
		
		// Code
		if (x < y) {
			System.out.println("X is less than Y.");
			
			if (z > y) {
				System.out.println("Z is greater than Y.");
				
				if (x > z) {
					System.out.println("X is greater than Z");
					
				}
				else { 
					System.out.println("X is less than Z");
					
				}
				
			}
			else {
				System.out.println("Second condition wasn't met.");
				
			}
			
		}
		else { 
			System.out.println("First condition wasn't met.");
		}
		
		System.out.println("Progam is finished.");

	}

}
