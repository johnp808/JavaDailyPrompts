package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DupWordCounter {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "", duplicateWord = "";
	private Map<String, Integer> wordsMap = new LinkedHashMap<>();
	private int counter = 0, dupCount = 0;
	
	public static void main(String[] args) {
		DupWordCounter dWC = new DupWordCounter();
		dWC.run();
	}
	
	public void run() {
		do {
			userInput();
			findDups();
			countDups();
			printAnswers();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = "The cat chased the mouse but the cat ran fast.";
	}
	
	public void findDups() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.toLowerCase().charAt(i);
			if(Character.isLetter(letter)) {
				word += letter;
			}
			else if (letter == ' ') {
				wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
				word = "";
			}
		}
		
		if (!word.isBlank()) {
			wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
			word = "";
		}
	}
	
	public void countDups() {
		for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
			if (entry.getValue() > 1) {
				dupCount++;
			}
		}
	}
	
	public void printAnswers() {
		System.out.println("Total Repeated Words: " + dupCount);
		for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
			if (entry.getValue() > 1) {
				duplicateWord = entry.getKey();
				dupCount = entry.getValue();
				System.out.println(duplicateWord + ": " + dupCount);
			}
		}
	}
	
	public boolean runAgain() {
		return false;
	}
	
	public void reset() {
		
	}
}
