package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingChar {

	private Scanner sc = new Scanner(System.in);
	private String userInput = "", sentence = "";
	private Map<Character, Integer> lettersMap = new LinkedHashMap<>();
	private char letter = ' ', answer = ' ';
	
	public static void main(String[] args) {
		NonRepeatingChar nRC = new NonRepeatingChar();
		nRC.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence An I Will Find The First Non Repeating Character: ");
		do {
			userInput();
			check();
			printAnswer();			
		} while (runAgain());
	}
	
	public void userInput() {
		while(true) {
			sentence = sc.nextLine().toLowerCase();
			if(sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
			}
			else {
				break;
			}
		}
		
	}
	
	public void check() {
		// take each letter from sentence and map to a key and integer
		// find the first letter that integer == 1 and set that to the answer
		for (int i =0; i < sentence.length(); i++) {
			letter = sentence.charAt(i);
			if (Character.isLetter(letter)) {
				lettersMap.put(letter, lettersMap.getOrDefault(letter, 0) + 1);
			}
		}
	}
	
	public boolean checkForNonRepeatingChar() {
		for (int value : lettersMap.values()) {
			if (value == 1) {
				return true;
			}
		}
		return false;
	}
	
	public void printAnswer() {
		if(checkForNonRepeatingChar()) {
			for (Map.Entry<Character, Integer> entry : lettersMap.entrySet()) {
				if (entry.getValue() == 1) {
					answer = entry.getKey();
					System.out.println("First non-repeating letter: " + answer);
					break;
				}
			}
		}
		else {
			System.out.println("No non-repeating letters found.");

		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Enter A New Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if(userInput.equals("1")) {
				System.out.println("Enter A New Sentence:");
				reset();
				return true;
			}
			else if(userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
		
	}
	
	public void reset() {
		lettersMap.clear();
		sentence = "";
		userInput = "";
	}
}
