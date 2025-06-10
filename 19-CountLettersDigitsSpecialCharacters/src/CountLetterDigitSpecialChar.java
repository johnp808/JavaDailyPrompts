import java.util.Scanner;

public class CountLetterDigitSpecialChar {

	private Scanner sc = new Scanner(System.in);
	private int charCount = 0, digitCount = 0, sCharCount = 0;
	private String sentence = "";
	
	public static void main(String[] args) {
		CountLetterDigitSpecialChar sR = new CountLetterDigitSpecialChar();
		sR.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence");
		sentence = "Hello World! 123 :)";
		
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			
			if(Character.isLetter(c)) {
				System.out.println("letter: " + c);
				charCount++;
			}
			else if(Character.isDigit(c)) {
				System.out.println("Digit: " + c);
				digitCount++;
			}
			else if(c != ' ') {
				System.out.println("s Char: " + c);
				sCharCount++;
			}
		}
	}
}
