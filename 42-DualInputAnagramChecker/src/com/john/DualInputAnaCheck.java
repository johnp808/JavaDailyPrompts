package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DualInputAnaCheck {

	private Scanner sc = new Scanner(System.in);
	private String input1 = "", input2 = "", userInput = "";
	private Map<Character, Integer> lettersMap1 = new LinkedHashMap<>();
	private Map<Character, Integer> lettersMap2 = new LinkedHashMap<>();

	public static void main(String[] args) {
		DualInputAnaCheck dIAC = new DualInputAnaCheck();
		dIAC.run();
	}
	
	public void run() {
		System.out.println("Please Input A Word Or Sentence: ");
		do {
			userInput();
			addLettersToMap();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		input1 = sc.nextLine();
		System.out.println("Enter Another Word Or Sentence And I Will Check If They Are Anagrams:");
		input2 = sc.nextLine();
	}
	
	public void addLettersToMap() {
		for (int i = 0; i < input1.length(); i++) {
			char letter = input1.toLowerCase().charAt(i);
			if (Character.isLetter(letter)) {
				lettersMap1.put(letter, lettersMap1.getOrDefault(letter, 0) + 1);
			}
		}
		for (int i = 0; i < input2.length(); i++) {
			char letter = input2.toLowerCase().charAt(i);
			if (Character.isLetter(letter)) {
				lettersMap2.put(letter, lettersMap2.getOrDefault(letter, 0) + 1);
			}
		}
	}
	
	public boolean compare() {
		return lettersMap1.equals(lettersMap2);
	}
	
	public void printAnswer() {
		if (compare()) {
			System.out.println("First String: " + input1);
			System.out.println("Second String: " + input2);
			System.out.println("\nThese Are Anagrams!");
		}
		else if (!compare()) {
			System.out.println("First String: " + input1);
			System.out.println("Second String: " + input2);
			System.out.println("\nThese Are Not Anagrams!");
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Run The Program Again?\n1) Yes \n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter Another Word: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Enter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		lettersMap1.clear();
		lettersMap2.clear();
	}
}
