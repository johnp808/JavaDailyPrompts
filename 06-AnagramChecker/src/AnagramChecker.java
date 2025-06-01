import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	private Scanner sc = new Scanner(System.in);
	private String input1 = "", input2 = "", userInput ="";
	private boolean running = true;
	
	public static void main(String[] args) {
		AnagramChecker aC = new AnagramChecker();
		
		aC.run();
	}
	
	public void run() {
		System.out.println("Lets play Anagram Checker!\n");
		
		do {
			
			System.out.println("Enter Your First Word:\n");
			input1 = sc.nextLine().toLowerCase();
			System.out.println("Enter Your Second Word:\n");
			input2 = sc.nextLine().toLowerCase();
			
			char[] input1Letters = input1.toCharArray();
			char[] input2Letters = input2.toCharArray();
			
			for(int i = 0; i < input1Letters.length - 1; i++) {
				for(int j = 0; j < input1Letters.length - 1 -i; j++) {
					if(input1Letters[j] > input1Letters[j + 1]) {
						char tempLetter = input1Letters[j];
						input1Letters[j] = input1Letters[j + 1];
						input1Letters[j + 1] = tempLetter;
					}
				}
			}
			
			for(int i = 0; i < input2Letters.length - 1; i++) {
					for(int j = 0; j < input2Letters.length - 1 -i; j++) {
						if(input2Letters[j] > input2Letters[j + 1]) {
							char tempLetter = input2Letters[j];
							input2Letters[j] = input2Letters[j + 1];
							input2Letters[j + 1] = tempLetter;
						}
					}
			}
			
			String finalInput1 = new String(input1Letters).trim();
			String finalInput2 = new String(input2Letters).trim();

			if(finalInput1.equals(finalInput2)) {
				System.out.println(input1 + " And " + input2 + " Are Anagrams!");
			}
			else if(!finalInput1.equals(finalInput2)) {
				System.out.println(input1 + " And " + input2 + " Are Not Anagrams!");
			}
			
			System.out.println();
			userInput = "";
			
			while(!userInput.equals("1") && !userInput.equals("2")) {
				
				System.out.println("Would You Like To Play Again?\n1) Yes\n2) No\n");
				userInput = sc.nextLine();
				
				if(userInput.equals("1")) {
					System.out.println();
				}
				else if(userInput.equals("2")) {
					System.out.println("\nGoodbye!");
					running = false;
				}
				else {
					System.out.println("Please Select A Valid Option...\n");
				}
			}
		} while(running);
	}
}
