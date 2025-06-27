package com.john;

import java.util.Scanner;

public class CountWords {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", word = "", userInput = "";
	private int vowelCount = 0;
	
	public static void main(String[] args) {
		CountWords cW = new CountWords();
		cW.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence And I Will Count The Words That Start With A Vowel!");
		do {
			userInput();
			countVowels();
			printResults();
		}while(runAgain());
	}
	
	public void userInput() {
		while (true) {
			sentence = sc.nextLine().toLowerCase();
			if (sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
				continue;
			}
			else {
				break;
			}
		}
		
	}
	
	public void countVowels() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			
			if (Character.isLetter(letter)) {
				word += letter;
			}
			else if (letter == ' ') {
				checkIfVowel();
			}
		}
		if (!word.isBlank()) {
			checkIfVowel();
		}
	}
	
	public void checkIfVowel() {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
			vowelCount++;
		}
		word = "";
	}
	
	public void printResults() {
		System.out.println("Words That Start With A Vowel: " + vowelCount);
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Check Another Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter Another Sentence:");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Enter A Valid Option!");
			}
		}
	}
	
	public void reset() {
		sentence = "";
		vowelCount = 0;
	}
}
