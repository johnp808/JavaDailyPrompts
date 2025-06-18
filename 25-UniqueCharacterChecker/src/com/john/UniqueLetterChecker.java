package com.john;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueLetterChecker {
	private Scanner sc = new Scanner(System.in);
	private String word = "", userInput = "";
	private Set<Character> uniqueChars = new LinkedHashSet<Character>();
	private boolean dupFound = true;
	
	public static void main(String[] args) {
		UniqueLetterChecker uLC = new UniqueLetterChecker();
		uLC.run();
	}
	
	public void run() {
		do {
			userInput();
			check();
			result();
		}while(runAgain());
		
	}
	
	public void userInput() {
		System.out.print("Please Enter A Word: ");
		while(true) {
			word = sc.nextLine().trim();
			if (word.isBlank() || word.matches(".*[^a-zA-Z0-9 ].*") || word.matches(".*\\d.*")) {
				System.out.println("\nPlease Use Letters Only...");
				continue;
			}
			else {
				break;
			}
		}
	}
	
	public void check() {
		dupFound = false;
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (uniqueChars.contains(letter)) {
				dupFound = true;
				break;
			}
			else {
				uniqueChars.add(letter);
			}
		}
	}
	
	public void result() {
		System.out.println();
		if (dupFound) {
			System.out.println("Duplicate Characters Were Found.");
		}
		else {
			System.out.println("All characters are unique");
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Enter Another Word?\n1) Yes\n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println();
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye");
				return false;
			}
			else {
				System.out.println("Please Select A Valid Option...");
			}
		}
	}
	
	public void reset() {
		word = "";
		userInput = "";
		dupFound = true;
		uniqueChars.clear();
	}
	
}
