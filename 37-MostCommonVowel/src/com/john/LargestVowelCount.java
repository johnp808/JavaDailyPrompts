package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestVowelCount {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", input = "";
	private Map<Character,Integer> vowelsMap = new LinkedHashMap<>();
	private int vowelCount = 0, largestVowels = 0;
	
	public static void main(String[] args) {
		LargestVowelCount lVC = new LargestVowelCount();
		lVC.run();
	}
	
	public void run() {
		System.out.println("Input Words And I Will Find The Largest Vowel(s) And Print The Results:");
		do {
			userInput();
			countVowels();
			findVowelFreqAndCount();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		while (true) {
			sentence = sc.nextLine();
			if (sentence.matches("^[\\d\\W_]+$")) {
				System.out.println("Please Input Letters...");
			}
			else if (sentence.isBlank()) {
				System.out.println("Please Input At Least One Letter...");
			}
			else {
				break;
			}
		}
	}
	
	public void countVowels() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.toLowerCase().charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				vowelsMap.put(letter, vowelsMap.getOrDefault(letter, 0) + 1);
			}
		}
	}
	
	public void findVowelFreqAndCount() {
		for (int count : vowelsMap.values()) {
			if (count > vowelCount) {
				vowelCount = count;
			}
		}
		for (int count : vowelsMap.values()) {
			if (count == vowelCount) {
				largestVowels++;
			}
		}
	}
	
	public void printAnswer() {
		if (vowelsMap.isEmpty()) {
			System.out.println("No Vowels Found.");
		}
		else {
			System.out.print("Most Common Vowel" + (largestVowels > 1 ? "s: " : ": "));
			char vowel = ' ';
			int commaCount = 0;
			for (Map.Entry<Character, Integer> entry : vowelsMap.entrySet()) {
				if (entry.getValue() == vowelCount) {
					vowel = entry.getKey();
					commaCount++;
					System.out.print(vowel + (commaCount < largestVowels ? ", " : "\nFrequency: " + vowelCount + "\n\n"));
				}
			}
		}
	}
	
	public boolean runAgain() {
		System.out.println("Would You Like To Run The Program Again? \n1) Yes \n2) No");
		while (true) {
			input = sc.nextLine();
			if (input.equals("1")) {
				System.out.println("Input Another Entry: ");
				reset();
				return true;
			}
			else if (input.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Use A Valid Option...");
			}
		}
	}
	
	public void reset() {
		vowelsMap.clear();
		vowelCount = 0;
		largestVowels = 0;
		sentence = "";
	}
}
