package com.john;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class wordsExtractor {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", word = "", reverse = "", userInput = "";
	private int count = 0;
	private Set<String> palindromes = new LinkedHashSet<>();
	
	public static void main(String[] args) {
		wordsExtractor wE = new wordsExtractor();
		wE.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence, I Will Then List All The Palindromes Within it: ");
		do {
			userInput();
			extractWords();
			printAnswers();
		} while(runAgain());
	}
	
	public void userInput () {
		sentence = sc.nextLine().toLowerCase();
	}
	
	public void extractWords() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (Character.isLetter(letter)) {
				word += letter;
			}
			
			if (letter == ' ') {
				if (word.length() > 1) {
					paliCheck();
				}
			}
		}
		if (!word.isBlank()) {
			paliCheck();
		}
		
	}
	
	public void paliCheck() {
		for(int j = 0; j < word.length(); j++) {
			char rLetter = word.charAt(j);
			reverse = rLetter + reverse;
		}
		if (word.equals(reverse)) {
			palindromes.add(reverse);
		}
		word = "";
		reverse = "";
	}
	
	public void printAnswers() {
		if (palindromes.isEmpty()) {
			System.out.println("No Palindromes Found, Try Again!\n");
		}
		else {
			System.out.print("Palindromic Words: ");
			for (String pali : palindromes) {
				System.out.print( pali + (palindromes.size() - 1 > count ? ", " : "\n\n"));
				count++;
			}
		}
	}
	
	public boolean runAgain() {
		System.out.println("Would You Like To Run It Again?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Please Enter Another Sentence: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Bye Bye!");
				return false;
			}
			else {
				System.out.println("Enter Either 1 Or 2...");
			}
		}
	}
	
	public void reset() {
		palindromes.clear();
	}
}
