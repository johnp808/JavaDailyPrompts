package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DupWordCounter {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "", duplicateWord = "";
	private Map<String, Integer> wordsMap = new LinkedHashMap<>();
	private int dupCount = 0;
	
	public static void main(String[] args) {
		DupWordCounter dWC = new DupWordCounter();
		dWC.run();
	}
	
	public void run() {
		System.out.println("Enter A Sentence To Find All Duplicate Words And Frequency Used: ");
		do {
			userInput();
			findDups();
			countDups();
			printAnswers();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = sc.nextLine();
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
		System.out.println("\nWould You Like To Run The Program Again? \n1) Yes \n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter Your Next Sentence: ");
				reset();
				return true;
				
			}
			else if (userInput.equals("2")) {
				System.out.println("GoodBye");
				return false;
				
			}
			else {
				System.out.println("Please Enter A Valid Option...");
				
			}
		}
	}
	
	public void reset() {
		wordsMap.clear();
		
	}
}
