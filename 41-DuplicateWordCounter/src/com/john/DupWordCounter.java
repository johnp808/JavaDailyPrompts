package com.john;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DupWordCounter {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "";
	private Map<String, Integer> wordsMap = new LinkedHashMap<>();
	
	public static void main(String[] args) {
		DupWordCounter dWC = new DupWordCounter();
		dWC.run();
	}
	
	public void run() {
		do {
			userInput();
			findDups();
			printAnswers();
		}while(runAgain());
	}
	
	public void userInput() {
		
	}
	
	public void findDups() {
		
	}
	
	public void printAnswers() {
		
	}
	
	public boolean runAgain() {
		return false;
	}
	
	public void reset() {
		
	}
}
