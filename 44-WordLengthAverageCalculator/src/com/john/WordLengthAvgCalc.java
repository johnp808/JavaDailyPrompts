package com.john;

import java.util.Scanner;

public class WordLengthAvgCalc {

	private Scanner sc = new Scanner(System.in);
	private String userInput = "", sentence = "", word = "";
	private double totalLetters = 0, totalWords = 0, average = 0;
	
	
	public static void main(String[] args) {
		WordLengthAvgCalc wLAC = new WordLengthAvgCalc();
		wLAC.run();
	}
	
	public void run() {
		System.out.println("Enter A Sentence And I Will Find The Average Between Of The Letters And Words");
		do {
			userInput();
			count();
			calculate();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = sc.nextLine().toLowerCase();
	}
	
	public void count() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (Character.isLetter(letter)) {
				word += letter;
			}
			else if (letter == ' ') {
				totalWords++;
			}
		}
		if (!word.isBlank()) {
			totalLetters += word.length();
			totalWords++;
		}
	}
	
	public void calculate() {
		average = totalLetters / totalWords;
	}
	
	public void printAnswer() {
		if(average != 0) {
			System.out.printf("Average Word Length: %.2f", average);
		}
		else {
			System.out.println("No Valid Words Found...");
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Run The Prompt Again? \n1) Yes \n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter Another Sentence To Find The Average Of: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Try Again: \nEnter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		totalLetters = 0;
		totalWords = 0;
		average = 0;
		word = "";
	}
}
