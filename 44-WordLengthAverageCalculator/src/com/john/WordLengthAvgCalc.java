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
		sentence = "The quick brown fox jumps over the lazy dog.".toLowerCase();
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
	}
	
	public void printAnswer() {
		
	}
	
	public boolean runAgain() {
		return false;
	}
	
	public void reset() {
		
	}
}
