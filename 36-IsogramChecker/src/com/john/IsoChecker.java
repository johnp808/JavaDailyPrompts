package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IsoChecker {

	private Scanner sc = new Scanner(System.in);
	private String input = "", userInput = "";
	private Map<Character, Integer> lettersMap = new LinkedHashMap<>();
	private boolean letterCheck = true;
	
	public static void main(String[] args) {
		IsoChecker iC = new IsoChecker();
		iC.run();
	}
	
	public void run() {
		System.out.println("Type A Word Or Sentence And I Will Check If Its An Isogram Or Not: ");
		do {
			userInput();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		while(true) {
			input = sc.nextLine();
			if (input.isBlank()) {
				System.out.println("Please Enter Something...");
			}
			else {
				break;
			}
		}
	}
	
	public boolean checkInput() {
		for (int i = 0; i < input.length(); i++) {
			char letter = input.toLowerCase().charAt(i);
			if (Character.isLetter(letter)) {
				if(lettersMap.containsKey(letter)) {
					return false;
				}
				else {
					lettersMap.put(letter, lettersMap.getOrDefault(letter, 0) + 1);
				}
			}
		}
	return true;	
	}
	
	public void printAnswer() {
		if (checkInput()) {
			System.out.println(input + " Is An Isogram!");
		}
		else if (!checkInput()) {
			System.out.println(input + " Is Not An Isogram!");
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Check If Another Input Is An Isogram?\n1) Yes\n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter Your New Word Or Sentence: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Choose A Valid Option...");
			}
		}
	}
	
	public void reset() {
		input = "";
		userInput = "";
		lettersMap.clear();
	}
}
