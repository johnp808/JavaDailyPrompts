package com.john;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SpecialCharExtractor {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "";
	private Set<Character> uniqueChars = new LinkedHashSet<>();
	
	public static void main(String[] args) {
		SpecialCharExtractor sCE = new SpecialCharExtractor();
		sCE.run();
	}
	
	public void run() {
		do {
			userInput();
			checkSpecialChars();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = "Coding";
	}
	
	public void checkSpecialChars() {
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (!Character.isLetterOrDigit(c)) {
				uniqueChars.add(c);
			}
		}
	}
	
	public void printAnswer() {
		 int counter = 0;
		System.out.println("Input: " + sentence);
		System.out.print("Output: ");
		if (!uniqueChars.isEmpty()) {
			System.out.print("Unique Special Characters: ");
			for (Character sChar : uniqueChars) {
				System.out.print(sChar + (counter < uniqueChars.size() - 1 ? " " : "\n\n"));
				counter++;
			}
		}
		else {
			System.out.println("No Special Characters...");
		}
	}
	
	public boolean runAgain() {
		return false;
	}
	
	public void reset() {
		
	}
	
}
