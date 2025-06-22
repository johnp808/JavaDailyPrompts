package com.john;

import java.util.ArrayList;
import java.util.Scanner;

public class WordChainValidator {

	private Scanner sc = new Scanner(System.in);
	private String sentence ="", userInput = "", lastWord ="", currentWord = "", comboBreaker = "", wordCheck = "";
	private String [] words = new String [0];
	private char lastChar = ' ', firstChar = ' ';
	private boolean chain = true;
	
	public static void main(String[] args) {
		WordChainValidator wCV = new WordChainValidator();
		wCV.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence To Check If the Word Chain Is Valid Or Not:");
		do {
			userInput();
			validator();
			printResult();
		} while(runAgain());
	}
	
	public void userInput() {
		sentence = sc.nextLine();
	}
	
	public void validator() {
		words = sentence.trim().toLowerCase().split("\\s+");
		wordCheck = words[0];
		for(int i = 1; i< words.length; i++) {
			lastWord = words[i - 1];
			if(!words[i].isBlank()) {
				currentWord = words[i];
				lastChar = lastWord.charAt(lastWord.length() - 1);
				firstChar = currentWord.charAt(0);
				if (lastChar != firstChar) {
					comboBreaker = currentWord;
					chain = false;
					break;
				}
			}
		}
	}
	
	public void printResult() {
		System.out.println(lastWord);
		if (wordCheck.isBlank()) {
			System.out.println("Please Input Something.");
		}
		else if (words.length == 1) {
			System.out.println("Not Enough Words To Form A Chain.");
		}
		else if (!chain) {
			System.out.println("invalid Word Chain: '" + comboBreaker + "' Does Not Start With '" + lastChar + "'");
		}
		else {
			System.out.println("This Is A Valid Word Chain!");
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Please Enter Another Sentence:");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		sentence = "";
		comboBreaker = "";
		currentWord = "";
		lastWord ="";
		firstChar = ' ';
		lastChar = ' ';
		chain = true;
	}
}
