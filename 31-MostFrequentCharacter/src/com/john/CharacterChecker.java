package com.john;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CharacterChecker {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private char biggestLetter = ' ';
	private int counter = 0, commaCount = 0;
	private Map<Character, Integer> charsMap = new HashMap<>();
	
	
	
	public static void main(String[] args) {
		CharacterChecker cC = new CharacterChecker();
		cC.run();
	}
	
	public void run() {
		do {
			userInput();
			countChars();
			printAnswer();
		} while(runAgain());
	}
	
	public void userInput() {
		sentence = "Tt Aa Bb".toLowerCase();
	}
	
	public void countChars() {
		for (char letter : sentence.toCharArray()) {
			if (Character.isLetter(letter)) {
				charsMap.put(letter, charsMap.getOrDefault(letter, 0) + 1);
			}
		}
		for (int i = 0; i < charsMap.size(); i++) {
			for(int count : charsMap.values()) {
				if (count > counter) {
					counter = count;
				}
			}
		
		}
	}
	
	public void printAnswer() {
		System.out.print("Most Frequent Letter(s): ");
		for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
			if (entry.getValue() == counter) {
				System.out.print(entry.getKey());
				System.out.print(commaCount > counter ? ", " : "\n");
				commaCount++;
			}
		}
		System.out.println("Frequency: " + counter);
	}
	
	public boolean runAgain() {
		return false;
	}
	
	public void reset() {
		
	}
}
