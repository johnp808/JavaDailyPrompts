package com.john;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SpecialCharExtractor {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private Set<Character> uniqueChars = new LinkedHashSet<>();
	private int counter = 0;
	
	public static void main(String[] args) {
		SpecialCharExtractor sCE = new SpecialCharExtractor();
		sCE.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence And I Will Output The Special Characters Found Within.");
		do {
			userInput();
			checkSpecialChars();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = sc.nextLine();
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
		System.out.println("Would You Like To Run The Program Again? \n1) Yes \n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Please Enter Another Sentence: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		uniqueChars.clear();
		sentence = "";
		userInput = "";
		counter = 0;
	}
	
}
