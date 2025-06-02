import java.util.Scanner;

public class WordReversal {

	Scanner sc = new Scanner(System.in);
	private String input = "", word = "" ,reversed = "";
	private String [] words = new String[200];
	public static void main(String[] args) {
		WordReversal wR = new WordReversal();
		wR.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence You'd Like To Have Reversed!");
		input = sc.nextLine();
		reverseSentence();
		System.out.print("Result:\n" + reversed.trim());
	}
	
	public void reverseSentence() {
		int wordIndex = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			if (letter != ' ') {
				word += letter;
			}
			
			if ((letter == ' ' && !word.isBlank()) || i == input.length() - 1) {
				if(!word.isBlank()) {
					words[wordIndex++] = word;
					word = "";
				}
			}
		}
		
		for (int i = wordIndex - 1; i >= 0; i--) {
			reversed += words[i] + " ";
		}
	}
}
