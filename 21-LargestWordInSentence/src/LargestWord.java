import java.util.ArrayList;
import java.util.Scanner;

public class LargestWord {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "", largestWord = "";
	private ArrayList<String> words = new ArrayList<String>();
	private int counter = 0;
	public static void main(String[] args) {
		LargestWord lW = new LargestWord();
		lW.run();
	}

	public void run() {
		do {
			reset();
			System.out.println("Please Enter A Sentence And I Will Return The Largest Word Back To You!");
			sentence = sc.nextLine();
			addWordsToList();
			System.out.println("The Largest Word Is: " + getLargestWord().toLowerCase());
		} while(playAgain());
	}
	
	public boolean playAgain() {
		System.out.println("\nWould You Like To Enter Another Sentence?\n1) Yes\n2) No");
		while(true ) {
			userInput = sc.nextLine();
			if (userInput.equals("1")) {
				return true;
			}
			else if (userInput.equals("2")) {
				System.out.println("Goodbye");
				return false;
			}
			else {
				System.out.println("Please Enter A Valid Choice...");
				continue;
			}
		}
	}
	
	public void addWordsToList() {
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (!Character.isLetter(c)) {
				words.add(word.trim());
				word = "";
			}
			else if (c >= 'a' && c <= 'z' ||
				c >= 'A' && c <= 'Z') {
				word += c;
			}
		}
		if(!word.isEmpty()) {
			words.add(word.trim());
		}
	}
	
	public String getLargestWord() {
		for (String string : words) {
			if(string.length() > counter) {
				largestWord = string;
				counter = string.length();
			}
		}
		if(largestWord.isBlank()) {
			return "You Didn't Enter Any Words...";
		}
		return largestWord;
	}
	
	public void reset() {
		words.clear();
		word = "";
		largestWord = "";
		counter = 0;
	}
}
