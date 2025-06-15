import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", singleWord = "";
	private ArrayList<String> words = new ArrayList<String>();
	private Map<String,Integer> wordCounts = new LinkedHashMap<>();
	
	public static void main(String[] args) {
		WordFrequencyCounter wFC = new WordFrequencyCounter();
		wFC.run();
	}

	public void run() {
		System.out.println("Welcome To The Sentence Word Counter!");
		do {
			System.out.println("Please Enter A Sentence:");
			reset();
			userInput();
			splitWords();
			countWords();
			System.out.println("Here Is The Count Of Each Word:");
			for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		} while(runAgain());
	}
	
	public void userInput() {
		while(true) {
			sentence = sc.nextLine().toLowerCase();
			if (sentence.isBlank()) {
				System.out.println("Please Enter A Sentence...");
				continue;
			}
				break;
		}
		
	}
	
	public void splitWords() {
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			
			if (!Character.isLetterOrDigit(c) && !singleWord.isBlank()) {
				words.add(singleWord);
				singleWord = "";
			}
			else if (Character.isLetterOrDigit(c)) {
				singleWord += c;
			}
		}
		
		if (!singleWord.isBlank()) {
			words.add(singleWord);
		}
	}
	
	public void countWords() {
		for (String word : words) {
			
			if (wordCounts.containsKey(word)) {
				wordCounts.put(word, wordCounts.get(word) + 1);
			}
			else {
				wordCounts.put(word, 1);
			}
		}
	}
	
	public void reset() {
		sentence = "";
		userInput = "";
		singleWord = "";
		words.clear();
		wordCounts.clear();
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while(true) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Option...");
			}
		}
	}
}
