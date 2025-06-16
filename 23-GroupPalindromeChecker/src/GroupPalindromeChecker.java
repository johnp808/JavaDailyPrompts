import java.util.ArrayList;
import java.util.Scanner;

public class GroupPalindromeChecker {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "", word = "";
	private ArrayList<String> words = new ArrayList<String>();
	
	public static void main(String[] args) {
		GroupPalindromeChecker gPC = new GroupPalindromeChecker();
		gPC.run();
	}
	
	public void run() {
		sentence = "Wow Anna went to kayak in the noon.".toLowerCase().trim();
		
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (!Character.isLetterOrDigit(c)) {
				System.out.println(word);
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
	
	
}
