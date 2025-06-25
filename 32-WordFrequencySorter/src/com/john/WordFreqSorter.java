package com.john;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFreqSorter {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", word = "", userInput = "";
	private Map<String,Integer> wordCounts = new HashMap<String,Integer>();
	private ArrayList<Map<String,Integer>> sortedWords = new ArrayList<Map<String,Integer>>();
	
	public static void main(String[] args) {
		WordFreqSorter wFS = new WordFreqSorter();
		wFS.run();
	}
	
	public void run() {
		do {
			userInput();
			addWordsToMap();
			sortWords();
			printResults();
		}while(runAgain());
	}
	
	public void userInput() {
		sentence = "The sun shines and the sun sets.";
	}
	
	public void addWordsToMap() {
		
	}
	
	public void sortWords() {
		
	}
	
	public boolean runAgain() {
		return false;
	}
	
	public void printResults() {
		
	}
	
	public void reset() {
		
	}
}
