package com.john;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CharacterChecker {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private char biggestLetter = ' ';
	private int charCounter = 0, totalTopCount = 0, commaCounter = 0;
	private Map<Character, Integer> charsMap = new HashMap<>();
	
	
	
	public static void main(String[] args) {
		CharacterChecker cC = new CharacterChecker();
		cC.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence and I Will Find The Most Frequent Characters Within It:");
		do {
			userInput();
			addCharsToMap();
			findMaxCharFrequency();
			countCharsWithMaxFrequency();
			printAnswer();
		} while(runAgain());
	}
	
	public void userInput() {
		while (true) {
			sentence = sc.nextLine().toLowerCase();
			if (sentence.isBlank()) {
				System.out.println("Please Enter At Least one Word...");
			}
			else {
				break;
			}
		}
	}
	
	public void addCharsToMap() {
		for (char letter : sentence.toCharArray()) {
			if (Character.isLetter(letter)) {
				charsMap.put(letter, charsMap.getOrDefault(letter, 0) + 1);
			}
		}
	}
	
	public void findMaxCharFrequency() {
		for (int i = 0; i < charsMap.size(); i++) {
			for(int count : charsMap.values()) {
				if (count > charCounter) {
					charCounter = count;
				}
			}
		}
	}
	
	public void countCharsWithMaxFrequency() {
		for (int value : charsMap.values()) {
			if (value == charCounter) {
				totalTopCount++;
			}
		}
	}
	
	public void printAnswer() {
		if (totalTopCount == 1) {
			System.out.print("\nMost Frequent Letter: ");
		}
		else {
			System.out.print("Most Frequent Letters: ");
		}
		for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
			if (entry.getValue() == charCounter) {
				biggestLetter = entry.getKey();
				commaCounter++;
				System.out.print(biggestLetter);
				System.out.print(commaCounter < totalTopCount ? ", " : "\n");
			}
		}
		System.out.println("Frequency: " + charCounter);
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while (true) {
			userInput = sc.nextLine();
			if(userInput.equals("1")) {
				System.out.println("Please Enter Another Sentence: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Enter a 1 Or 2...");
			}
		}
	}
	
	public void reset() {
		sentence = "";
		biggestLetter = ' ';
		charsMap.clear();
		charCounter = 0;
		totalTopCount = 0;
		commaCounter = 0;
	}
}
