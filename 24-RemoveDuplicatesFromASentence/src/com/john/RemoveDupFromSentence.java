package com.john;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupFromSentence {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "";
	private Set<String> words = new LinkedHashSet<String>();
	
	public static void main(String[] args) {
		RemoveDupFromSentence rDFS = new RemoveDupFromSentence();
		rDFS.run();
	}
	
	public void run() {
		userInput();
		splitWords();
	}
	
	public void userInput() {
		
	}
	
	public void splitWords() {
		sentence = "The cat chased the cat up the tree.";
		
		for(int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if(letter == ' ') {
				if(!word.isEmpty()) {
					words.add(word);
					word = "";
				}
			} 
			else if (Character.isLetterOrDigit(letter)) {
				word += letter;
			}
		}
		if (!word.isEmpty()) {
			words.add(word);
		}
	}
	
	public void removeWords() {
		
	}
}
