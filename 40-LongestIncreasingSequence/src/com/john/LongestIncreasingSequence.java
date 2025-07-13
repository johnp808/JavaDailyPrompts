package com.john;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", word = "", largestSeq = "", userInput = "";
	private ArrayList<String> sequences = new ArrayList<>();
	private char currentLetter = ' ', prevLetter = ' ';
	private int seqSize = 0;
	
	public static void main(String[] args) {
		LongestIncreasingSequence lIS = new LongestIncreasingSequence();
		lIS.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence And I Will Find The Longest Increasing Sequence Within It: ");
		do {
			userInput();
			check();
			findLargestSeq();
			printAnswer();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = sc.nextLine();
	}
	
	public void check() {
		for (int i =0; i < sentence.length(); i++) {
			currentLetter = sentence.toLowerCase().charAt(i);
			
			if (Character.isLetter(currentLetter)) {
				if (word.isBlank()) {
					word += "" + currentLetter;
				} 
				else {
					prevLetter = word.charAt(word.length() - 1);
					if (currentLetter > prevLetter) {
						word += currentLetter;
					} 
					else {
						if (word.length() > 1) {
							sequences.add(word);
						}
						word = "" + currentLetter;
					}
				}
			}
			else {
				if (word.length() > 1) {
					sequences.add(word);
				}
				word = "";
			}
		}
		if (word.length() > 1) {
			sequences.add(word);
		}
	}
	
	public void findLargestSeq() {
		int largest = 0;
		for (String seq : sequences) {
			seqSize = seq.length();
			if (seqSize > largest) {
				largest = seqSize;
				largestSeq = seq;
			}
		}
	}
	
	public void printAnswer() {
		if (seqSize > 1) {
			System.out.println("Longest Increasing Sequence: " + largestSeq);
		}
		else {
			System.out.println("No Sequence Found");
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Run Again?\n1) Yes\n2) No");
		while (true) {
			userInput = sc.nextLine();
			if(userInput.equals("1")) {
				System.out.println("Enter Another Sentence: ");
				reset();
				return true;
			}
			else if(userInput.equals("2")) {
				System.out.println("GoodBye!");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		sequences.clear();
		word = "";
		largestSeq = "";
		seqSize = 0;
	}
}
