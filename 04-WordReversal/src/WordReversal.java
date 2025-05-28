import java.util.Scanner;

public class WordReversal {

	private Scanner sc = new Scanner(System.in);
	private String input = "", reversedSentence = "", reverseEachWord = "", reverse = "", userChoice = "";
	private int i = 0;
	
	public static void main(String[] args) {
		
		WordReversal wR = new WordReversal();
		wR.run();
		
	}
	
	public void run() {
				System.out.println("Please Enter A Sentence:");
				input = sc.nextLine();
				for(i = 0; i < input.length(); i++) {
					
					char c = input.charAt(i);
					reversedSentence = c + reversedSentence;
					
					if (c != ' ') {
						reverse = c + reverse;
					}
					
					if(c == ' ' || i == input.length() - 1) {
						reverseEachWord += reverse + " ";
						reverse = "";
						continue;
					}
				}
				while(!userChoice.equals("1") || !userChoice.equals("2")) {
				System.out.println("\nChose An Option:\n\n1) Reverse Each Word\n\n2)Reverse The Whole Sentence\n");
				userChoice = sc.nextLine();
				
					if(userChoice.equals("1")) {
						reverseEachWord = reverseEachWord.trim();
						System.out.println(reverseEachWord);
					}
					else if(userChoice.equals("2")) {
						System.out.println(reversedSentence);
					}
					else {
						System.out.println("Please Select A Valid Option...");
						continue;
					}
					break;
				} 
	}
}
