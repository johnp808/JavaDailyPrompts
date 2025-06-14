import java.util.Scanner;

public class LargestWord {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	
	public static void main(String[] args) {
		LargestWord lW = new LargestWord();
		lW.run();
	}
	// create an arraylsit, for loop through sentence and at each space 
	// add each word to the array slots, for loop through the list 
	// set up a counter, if next word is bigger than last make it the largest Word
	//print out final word

	public void run() {
		sentence = "hey whats up hello";
	}
}
