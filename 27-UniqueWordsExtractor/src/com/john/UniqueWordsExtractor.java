package com.john;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordsExtractor {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "";
	private Set<String> uniqueWords = new LinkedHashSet<String>();
	private boolean exists = false;
	public static void main(String[] args) {
		UniqueWordsExtractor uWE = new UniqueWordsExtractor();
		uWE.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence I Will Extract All The Unique Words From It.");
		do {
			userInput();
			processSentence();
			printResults();
		} while(runAgain());
	}
	
	public void userInput() {
		while(true) {
			sentence = sc.nextLine();
			if (sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
			}
			else {
				break;
			}
		}
	}
	
	public void processSentence() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (letter == ' ') {
				checkCase();
			} 
			else if (Character.isLetter(letter)) {
				word += letter;
			}
		}
		checkCase();
	}
	
	public void printResults() {
		if (uniqueWords.isEmpty()) {
			System.out.println("No Unique Words In The Sentence...");
		}
		else {
			System.out.print("Unique Words: ");
			Iterator<String> it = uniqueWords.iterator();
			while(it.hasNext()) {
				String uWord = it.next();
				System.out.print(uWord + (it.hasNext() ? ", " : "\n\n"));
			}
		}
	}
	
	public boolean runAgain() {
		System.out.println("Would You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter Your New Sentence...");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye...");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
	
	public void checkCase() {
		if (!word.isBlank()) {

			for (String addedWord : uniqueWords) {
				if (addedWord.equalsIgnoreCase(word)) {
					exists = true;
					break;
				}
			}
			if (!exists) {
				uniqueWords.add(word);
			}
			word = "";
			exists = false;
		}
	}
	
	public void reset() {
		sentence = "";
		word = "";
		uniqueWords.clear();
	}
}
