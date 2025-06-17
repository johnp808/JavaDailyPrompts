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
		userInput();
		removeDups();
		printUniqueWords();
	}
	
	public void userInput() {
		
	}
	
	public void removeDups() {
		sentence = "The cat chased the cat up the tree.".toLowerCase().trim();
		
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
		System.out.println("Original Sentence: " + sentence);
		System.out.print("Unique Words: ");
		Iterator<String> it = uniqueWords.iterator();
		while(it.hasNext()) {
			String uniqueWord = it.next();
			System.out.print(uniqueWord + (it.hasNext() ? ", " : " "));
		}
	}
}
