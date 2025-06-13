import java.util.Scanner;

public class CountVowelAndConsonants {

	private Scanner sc = new Scanner(System.in);
	private String sentence = "", userInput = "";
	private int vowelCount = 0, conCount = 0;
	
	public static void main(String[] args) {
		CountVowelAndConsonants cVAC = new CountVowelAndConsonants();
		cVAC.run();
	}
	
	public void run() {
		System.out.println("Welcome To The Vowel And Consonant Counter!");
		do {
			System.out.println("Please Enter A Sentence!");
			userInput();
			count();
			System.out.println("Vowels: " + vowelCount + "\nConsonants: " + conCount);
			reset();
		} while(runAgain());
	}
	
	public void userInput() {
		while(true) {
			sentence = sc.nextLine().trim();
			if(sentence.trim().isEmpty() || sentence.matches("\\s+") ||
			   sentence.matches("\\d+") || sentence.matches("[^a-zA-Z0-9]+")) {
				System.out.println("Please Use Letters...");
				continue;
			}
			else {
				break;
			}
		}
	}
	
	public void count() {
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
				   c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				}
				else {
					conCount++;
				}
			}
		}
	}
	
	public boolean runAgain() {
		while(true) {
			System.out.println("\nWould You Like To Enter Another Sentence To Count?\n1) Yes\n2) No");
			userInput = sc.nextLine();
			if(userInput.equals("1")) {
				
				return true;
			}
			else if(userInput.equals("2")) {
				System.out.println("Goodbye!");
				return false;
			}
			else {
				System.out.println("Please Pick A Valid Option...");
				continue;
			}
		}
	}
	
	public void reset() {
		vowelCount = 0;
		conCount = 0;
	}
}
