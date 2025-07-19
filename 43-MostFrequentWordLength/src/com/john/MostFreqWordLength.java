package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFreqWordLength {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private Map<Integer, Integer> freqsMap = new LinkedHashMap<>();;
	private int counter = 0, maxFreq = 0, numMaxLengths = 0;
	
	public static void main(String[] args) {
		MostFreqWordLength mFWL = new MostFreqWordLength();
		mFWL.run();
	}
	
	public void run() {
		do {
			userInput();
			countFreq();
			findHighestCounts();
			printAnswers();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = sc.nextLine();
	}
	
	public void countFreq() {
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if(Character.isLetter(letter)) {
				count++;
			}
			else if (letter == ' ') {
				freqsMap.put(count, freqsMap.getOrDefault(count, 0) + 1);
				count = 0;
			}
		}
		if (count != 0) {
			freqsMap.put(count, freqsMap.getOrDefault(count, 0) + 1);
			count = 0;
		}
	}
	
	public void findHighestCounts() {
		for (Map.Entry<Integer, Integer> entry : freqsMap.entrySet()) {
			if(entry.getValue() > maxFreq) {
				maxFreq = entry.getValue();
				numMaxLengths = 1;
			}
			else if (entry.getValue() == maxFreq) {
				numMaxLengths++;
			}
		}
	}
	
	public void printAnswers() {
		System.out.print("Most Frequent Word Length" + (numMaxLengths >= 2 ? "s: " : ": "));
		for (Map.Entry<Integer, Integer> entry : freqsMap.entrySet()) {
			if( entry.getValue() == maxFreq) {
				System.out.print(entry.getKey() + " ");
			}
		}
		System.out.println("\nFrequency: " + maxFreq);
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Run The Program Again? \n1) Yes \n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Please Enter A New Sentence: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Enter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		freqsMap.clear();
		counter = 0;
		maxFreq = 0;
		numMaxLengths = 0;
	}
	
}
