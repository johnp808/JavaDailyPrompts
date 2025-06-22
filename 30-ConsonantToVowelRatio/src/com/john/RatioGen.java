package com.john;

import java.util.Scanner;

public class RatioGen {
	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private double ratio = 0, consCount = 0, vowelCount = 0;
	private boolean divideBy0 = false;
	
	public static void main(String[] args) {
		RatioGen rG = new RatioGen();
		rG.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence And I Will Calcualte The Consonant To Vowel Ratio: ");
		do {
			userInput();
			count();
			ratio();
			printResults();
		} while(runAgain());
	}
	
	public void userInput() {
		while(true) {
			sentence = sc.nextLine();
			if (sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
				continue;
			}
			else {
				break;
			}
		}
	}
	
	public void count() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (Character.isLetter(letter)) {
				if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
					vowelCount++;
				}
				else {
					consCount++;
				}
			}
		}
	}
	
	public void ratio() {
		if (consCount == 0 || vowelCount == 0) {
			divideBy0 = true;
		}
		else {
			ratio = consCount / vowelCount;
		}
	}
	
	public void printResults() {
		if (divideBy0) {
			System.out.println("Undefined / Divided By 0");
		}
		else {
			System.out.println("Vowels: " + (int)vowelCount);
			System.out.println("Consonants: " + (int)consCount);
			System.out.println("Ratio: " + String.format("%.2f",ratio));
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if(userInput.equals("1")) {
				System.out.println("Please Enter Another Sentence: ");
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
		sentence = "";
		consCount = 0;
		vowelCount = 0;
	}
}
