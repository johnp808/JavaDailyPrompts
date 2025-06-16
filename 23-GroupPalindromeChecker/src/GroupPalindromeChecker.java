import java.util.ArrayList;
import java.util.Scanner;

public class GroupPalindromeChecker {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "", reverseWord = "";
	private ArrayList<String> words = new ArrayList<String>(), palindromes = new ArrayList<String>();
	
	public static void main(String[] args) {
		GroupPalindromeChecker gPC = new GroupPalindromeChecker();
		gPC.run();
	}
	
	public void run() {
		System.out.println("Welcome To The Palindrome Checker!");
		do {
			System.out.println("Please Enter Words Separated By A Space Then Press Enter.");
			userInput();
			splitSentence();
			palindromeChecker();
			printPalindromes();
		} while(runAgain());
	}
	
	public void userInput() {
		while(true) {
			sentence = sc.nextLine().toLowerCase().trim();
			if(sentence.isBlank()) {
				System.out.println("Please Enter At Least One Word...");
			}
			else if (sentence.matches(".*\\d.*")) {
				System.out.println("Please Exclude Using Any Digits...");
			}
			else {
				break;
			}
		}
		
	}
	
	public void splitSentence() {
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (!Character.isLetterOrDigit(c)) {
				words.add(word);
				word = "";
			}
			else if (Character.isLetterOrDigit(c)) {
				word += c;
			}
		}
		if (!word.isBlank()) {
			words.add(word);
		}
	}
	
	public void palindromeChecker() {
		for(int i = 0; i < words.size(); i++) {
			for(int j = 0; j < words.get(i).length(); j++) {
				char letter = words.get(i).charAt(j);
				reverseWord = letter + reverseWord;
			}
			if (words.get(i).equals(reverseWord)) {
				palindromes.add(reverseWord);
			}
			reverseWord = "";
		}
	}
	
	public void printPalindromes() {
		System.out.println();
		if (palindromes.isEmpty()) {
			System.out.println("No Palindromes Found!");
		}
		else {
			System.out.print("Palindromes Found: ");
			for (int i = 0; i < palindromes.size(); i++) {
				System.out.print(palindromes.get(i) + (i == palindromes.size() - 1 ? " " : ", "));
			}
			System.out.println();
		}
	}
	
	public boolean runAgain() {
		System.out.println("\nWould You Like To Enter More Words To Check?\n1) Yes\n2) No");
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
		words.clear();
		palindromes.clear();
		reverseWord = "";
		word = "";
	}
}
