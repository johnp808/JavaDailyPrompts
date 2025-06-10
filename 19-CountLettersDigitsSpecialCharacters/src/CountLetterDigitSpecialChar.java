import java.util.Scanner;

public class CountLetterDigitSpecialChar {

	private Scanner sc = new Scanner(System.in);
	private int charCount = 0, digitCount = 0, sCharCount = 0;
	private String sentence = "", choice = "";
	
	public static void main(String[] args) {
		CountLetterDigitSpecialChar sR = new CountLetterDigitSpecialChar();
		sR.run();
	}
	
	public void run() {
		do {
			reset();
			userInput();
			calculate();
		} while(playAgain());
	}
	
	public void userInput() {
		System.out.println("Please Enter A Sentence...");
		sentence = sc.nextLine();
	}
	
	public void calculate() {
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			
			if(Character.isLetter(c)) {
				charCount++;
			}
			else if(Character.isDigit(c)) {
				digitCount++;
			}
			else if(c != ' ') {
				sCharCount++;
			}
		}
		if(charCount == 0 && digitCount == 0 && sCharCount == 0) {
			System.out.println("You Didn't Enter Anything...\n");
		}
		else {
			System.out.println("Letters: " + charCount + "\nDigits: " + digitCount + "\nSpecial Characters: " + sCharCount + "\n");
		}
	}
	
	public boolean playAgain() {
		while(true) {
			System.out.println("Would You Like To Play Again?\n1) Yes\n2) No");
			choice = sc.nextLine();
			if(choice.equals("1")) {
				return true;
			}
			else if(choice.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Choose One Of The Options...\n");
			}
		}
	}
	
	public void reset() {
		charCount = 0; 
		digitCount = 0; 
		sCharCount = 0;
		sentence = "";
		choice = "";
	}
}
