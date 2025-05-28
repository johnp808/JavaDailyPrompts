package com.john.thrax;

import java.util.Scanner;

public class PalindromeChecker {

	private Scanner scanner = new Scanner(System.in);
	private boolean running = true;
	private String input, reverseInput = "";
	private int ranNum, count = 0;
	private char letter;
	
	public static void main(String[] args) {
		PalindromeChecker test = new PalindromeChecker();
		
		test.palindromeChecker();
	}
	
	public void palindromeChecker() {
		
		System.out.println("Palindrome Checker... \n[Press Enter]");
		scanner.nextLine();
		
		while (running) {
			
			if (count == 0) {
				System.out.println("Please Type in a word and I will check if it is a palindrome...");				
			}
			
			else {
				System.out.println("Enter another Word or type exit to quit...");
			}
			
			input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("exit")) {
				running = false;
				System.out.println("Goodbye!");
			}
			
			else {
				
				for (int i = 0; i< input.length(); i++) {
					
					letter = input.charAt(i);
					reverseInput = letter + reverseInput;
				}
				
				System.out.println("Checking...\n");
				ranNum = (int) (Math.random() * 4) + 1;
				ranNum = ranNum * 1000;
				
				try {
					Thread.sleep(ranNum);
				}
				
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Done... \n[Press Enter]");
				scanner.nextLine();
				
				if (input.equalsIgnoreCase(reverseInput)) {
					System.out.println("Your word: " + input + " is a palindrome!" + "\n\n" + input + " = " + reverseInput);
				}
				
				else {
					System.out.println("Your word: " + input + " is not a palindrome!" + "\n\n" + input + " != " + reverseInput);
				}
				
				while (!input.equals("1") && !input.equals("2") ) {
					System.out.println("\nWould you like to play again? \n1) Yes \n2) No");
					input = scanner.nextLine();

					if (input.equals("1")) {
						count++;	
						reverseInput = "";
					}
					
					else if (input.equals("2")) {
						running = false;
						System.out.println("Goodbye thanks for playing!");
					}
					
					else {
						System.out.println("Please enter your answer again...");
					}
					
				}
			}
			
		}
		
	}
}
