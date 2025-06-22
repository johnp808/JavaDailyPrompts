package com.john;

import java.util.ArrayList;
import java.util.Scanner;

public class WordLengthClassifier {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", word ="", userInput = "";
	private int counter = 0;
	private ArrayList<String> shortWords = new ArrayList<String>(), mediumWords = new ArrayList<String>(), longWords = new ArrayList<String>();
	
	public static void main(String[] args) {
		WordLengthClassifier wLC = new WordLengthClassifier();
		wLC.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence: ");
		do {
		userInput();
		sortWords();
		printResults();
		} while(runAgain());
	}
	
	public void userInput() {
		while (true) {
			sentence = sc.nextLine();
			if (sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
			}
			else {
				break;
			}
		}
	}
	
	public void sortWords() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (letter == ' ') {
				sizeCheck();
			}
			else if (Character.isLetter(letter)) {
				word += letter;
				counter++;
			}
		}
		if (!word.isBlank()) {
			sizeCheck();
		}
	}
	
	public void sizeCheck() {
		counter = word.length();
		if (counter < 4) {
			shortWords.add(word);
		}
		else if (counter < 7) {
			mediumWords.add(word);
		}
		else if (counter > 6) {
			longWords.add(word);
		}
		word = "";
		counter = 0;
	}
	
	public void printResults() {
		if (!shortWords.isEmpty()) {
			counter = 0;
			System.out.print("Short Words (" + shortWords.size() + "): ");
			for (String shortWord : shortWords) {
				System.out.print(shortWord + (counter < shortWords.size() - 1 ? ", " : "\n"));	
				counter++;
			}
		}
		if (!mediumWords.isEmpty()) {
			counter = 0;
			System.out.print("Medium Words (" + mediumWords.size() + "): ");
			for (String mediumWord : mediumWords) {
				System.out.print(mediumWord + (counter < mediumWords.size() - 1 ? ", " : "\n"));	
				counter++;
			}
		}
		if (!longWords.isEmpty()) {
			counter = 0;
			System.out.print("Long Words (" + longWords.size() + "): ");
			for (String longWord : longWords) {
				System.out.print(longWord + (counter < longWords.size() - 1 ? ", " : "\n"));	
				counter++;
			}
		}
		System.out.println();
	}
	
	public boolean runAgain() {
		System.out.println("Would You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Please Enter Another Sentence: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Choose A Valid Answer...");
			}
		}
	}
	
	public void reset() {
		shortWords.clear();
		mediumWords.clear();
		longWords.clear();
	}
}
