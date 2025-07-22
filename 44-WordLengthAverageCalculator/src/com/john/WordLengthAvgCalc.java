package com.john;

import java.util.Scanner;

public class WordLengthAvgCalc {

	private Scanner sc = new Scanner(System.in);
	private String userInput = "", sentence = "", word = "";
	private int totalLetters = 0, totalWords = 0;
	
	
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
		sentence = "";
	}
	
	public void count() {
		
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
