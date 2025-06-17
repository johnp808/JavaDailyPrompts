package com.john;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupFromSentence {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "";
	private Set<String> uniqueWords = new LinkedHashSet<String>();
	
	public static void main(String[] args) {
		RemoveDupFromSentence rDFS = new RemoveDupFromSentence();
		rDFS.run();
	}
	
	public void run() {
		do {
			userInput();
			removeDups();
			printUniqueWords();
		} while(runAgain());
	}
	
	public void userInput() {
		System.out.println("Please Enter A Sentence And I Will Remove Any Duplicates From It!");
		while(true) {
			sentence = sc.nextLine().toLowerCase().trim();
			if(sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
				continue;
			}
			else {
				break;
			}
		}
	}
	
	public void removeDups() {
		
		for(int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if(letter == ' ') {
				if(!word.isEmpty()) {
					uniqueWords.add(word);
					word = "";
				}
			} 
			else if (Character.isLetterOrDigit(letter)) {
				word += letter;
			}
		}
		if (!word.isEmpty()) {
			uniqueWords.add(word);
		}
	}
	
	public void printUniqueWords() {
		System.out.println("Original Sentence: " + sentence + "\n");
		System.out.print("Unique Words: ");
		Iterator<String> it = uniqueWords.iterator();
		while(it.hasNext()) {
			String uniqueWord = it.next();
			System.out.print(uniqueWord + (it.hasNext() ? ", " : " "));
		}
		System.out.println();
		System.out.println();
	}
	
	public boolean runAgain() {
		System.out.println("Would You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
//				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("See Ya Later!");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
}
