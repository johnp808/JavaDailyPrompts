package com.john;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveCharStreak {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private char nextLetter = ' ', previousLetter =' ', streakChar = ' ';
	private int streakCount = 0, maxCount = 1;
	public static void main(String[] args) {
		LongestConsecutiveCharStreak lCCS = new LongestConsecutiveCharStreak();
		lCCS.run();
	}
	
	public void run() {
		do {
			userInput();
			check();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = "AAaaBBBBccCDDDD";
	}
	
	public void check() {
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
		return false;
	}
	
	public void reset() {
		
	}
	
}
