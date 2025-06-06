import java.util.Scanner;

public class LongestCommonPrefix {

	private Scanner sc = new Scanner(System.in);
	private String [] input = new String[10];
	private String firstWord = "", prefix = "", word = "";
	private char letter = ' ';
	private int number = 0;
	private boolean running = true;
	
	public static void main(String[] args) {
		LongestCommonPrefix lCP = new LongestCommonPrefix();
		lCP.run();
	}
	
	public void run() {
		enterWords();
		loopWords();
	}
	
	public void enterWords() {
		System.out.println("Welcome To The Longest Common Prefix!");
		System.out.println("Please Enter Up To 10 Words Or Type 1 To Exit...");
		while(number < 10 && running) {
			word = sc.nextLine();
			if(word.equals("1")) {
				running = false;
				break;
			}
			input[number] = word.trim();
			number++;
		}
	}
	
	public void loopWords() {
		
		if(input.length == 0 || input[0] == null) {
			System.out.println("No Common Prefix.");
			return;
		}
		
		firstWord = input[0];
		
		for (int i = 0; i < firstWord.length(); i++) {
			letter = firstWord.charAt(i); // f for fire
				for (int j = 1; j < input.length; j++) {
					// f for fighter
					if (input[j] != null) {
						if (i >= input[j].length() || input[j].charAt(i) != letter) {
							if(prefix.isEmpty()) {
								System.out.println("No Common Prefix.");
							}
							else {
								System.out.println("Longest Common Prefix: " + prefix);
							}
							return;
						}
					}
				}
				prefix += letter;
		}
		System.out.println(prefix);
	}
}
