import java.util.Scanner;

public class CountVowelAndConsonants {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private int vowels = 0, cons = 0;
	
	public static void main(String[] args) {
		CountVowelAndConsonants cVAC = new CountVowelAndConsonants();
		cVAC.run();
	}
	
	public void run() {
		System.out.println("Welcome To The Vowel/Consonant Counter! \nPlease Enter A Sentence!");
		sentence = "Hello World!".toUpperCase();
//		sentence = sc.nextLine().trim().toUpperCase();
		for(int i = 0; i < sentence.length(); i++) {
			
		}
	}
	
	
}
