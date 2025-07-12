package com.john;

import java.util.Scanner;

public class LongestConsecutiveCharStreak {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private char previousLetter =' ', streakChar = ' ';
	private int streakCount = 0, maxCount = 1;
	public static void main(String[] args) {
		LongestConsecutiveCharStreak lCCS = new LongestConsecutiveCharStreak();
		lCCS.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Word Or Sentence And I Will Find The Longest Consecutive Letter: ");
		do {
			userInput();
			countChars();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = sc.nextLine();
	}
	
	public void countChars() {
		for (int i = 0; i < sentence.length(); i++) {
			char currentLetter = sentence.toLowerCase().charAt(i);
			if( i != 0) {
				previousLetter = sentence.toLowerCase().charAt(i - 1);
			}
			if(currentLetter == previousLetter && Character.isLetter(currentLetter)) {
				streakCount++;
			}
			else {
				streakCount = 1;
			}
			
			if (streakCount > maxCount) {
				maxCount = streakCount;
				streakChar = currentLetter;
			}
		}
	}
	
	public void printAnswer() {
		if (maxCount > 1) {
			System.out.println("Input: " + sentence);
			System.out.println("Output: Character: " + streakChar);
			System.out.println("\tStreak: " + maxCount);
		}
	}
	
	public boolean runAgain() {
		while (true) {
			System.out.println("\nWould You Like To Run It Again?\n1) Yes\n2) No");
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter A New Sentence Or Word: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		streakChar = ' ';
		streakCount = 0;
		maxCount = 0;
	}
}
