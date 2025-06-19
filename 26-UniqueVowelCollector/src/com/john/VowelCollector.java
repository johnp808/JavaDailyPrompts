package com.john;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelCollector {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private Set<Character> uniqueVowels = new LinkedHashSet<Character>();
	private boolean vowelsFound = true;
	
	public static void main(String[] args) {
		VowelCollector vC = new VowelCollector();
		vC.run();
	}
	
	public void run() {
		do {
			userInput();
			findVowels();
			printUniqueVowels();
		} while(runAgain());
	}
	
	public void userInput() {
		System.out.println("Please Enter A Sentence And I'll Find The Vowels Within It!");
		while(true) {
			sentence = sc.nextLine();
			if(sentence.isBlank()) {
				System.out.println("Please Enter A Sentence...");
				continue;
			}
			break;
		}
	}
	
	public void findVowels() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
				letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
				uniqueVowels.add(letter);
			}
		}
		if (uniqueVowels.isEmpty()) {
			vowelsFound = false;
		}
	}
	
	public void printUniqueVowels() {
		if (vowelsFound) {
			System.out.print("Unique Vowels Found: ");
			Iterator<Character> it = uniqueVowels.iterator();
			while (it.hasNext()) {
				char vowel = it.next();
				System.out.print(vowel + (it.hasNext() ? ", " : "\n\n"));
			}
		}
		else {
			System.out.println("No Vowels Found!");
		}
	}
	
	public boolean runAgain() {
		System.out.println("Would You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
	
	public void reset() {
		sentence = "";
		uniqueVowels.clear();
		vowelsFound = true;
	}
}
