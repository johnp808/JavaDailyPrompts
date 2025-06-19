package com.john;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelCollector {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private Set<String> uniqueVowels = new LinkedHashSet<String>();
	
	public static void main(String[] args) {
		VowelCollector vC = new VowelCollector();
		vC.run();
	}
	
	public void run() {
		
	}
	
	public void userInput() {
		
	}
	
	public void findVowels() {
		sentence = "Programming is fun and educational!".toLowerCase().trim();
		
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				
			}
		}
	}
}
