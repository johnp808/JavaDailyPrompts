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
		do {
			userInput();
			count();
			calculate();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = "48394 437346 20347".toLowerCase();
	}
	
	public void count() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (Character.isLetter(letter)) {
				word += letter;
			}
			else if (letter == ' ') {
				totalLetters += word.length();
				totalWords++;
				word = "";
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
		return false;
	}
	
	public void reset() {
		
	}
}
