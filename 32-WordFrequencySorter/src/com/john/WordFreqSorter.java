package com.john;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordFreqSorter {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", word = "", userInput = "";
	private Map<String,Integer> wordCounts = new LinkedHashMap<String,Integer>();
	private ArrayList<Map.Entry<String,Integer>> sortedWords;
	
	public static void main(String[] args) {
		WordFreqSorter wFS = new WordFreqSorter();
		wFS.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence. I Will Then Print The Words From Greatest Frequency To Least: ");
		do {
			userInput();
			breakSentenceIntoWords();
			sortWords();
			printResults();
		}while(runAgain());
	}
	
	public void userInput() {
		while (true) {
			sentence = sc.nextLine().toLowerCase();
			if (sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
			}
			else {
				break;
			}
		}
	}
	
	public void breakSentenceIntoWords() {
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (Character.isLetter(letter)) {
				word += letter;
			}
			else if (letter == ' ') {
				addWordToMap();
			}
		}
		if (!word.isBlank()) {
			addWordToMap();
		}
	}
	
	public void addWordToMap() {
		wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
		word = "";
	}
	
	public void sortWords() {
		sortedWords = new ArrayList<>(wordCounts.entrySet());
		sortedWords.sort((word1, word2) -> word2.getValue().compareTo(word1.getValue()));

	}
	
	public void printResults() {
		for (Entry<String, Integer> entry : sortedWords) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Run The Program Again?\n1) Yes\n2) No");
		while (true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				System.out.println("Enter Antother Sentence: ");
				reset();
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye");
				return false;
			}
		}
	}
	
	public void reset() {
		sentence = "";
		word = "";
		wordCounts.clear();
		sortedWords.clear();
	}
}
