import java.util.Scanner;

public class VowelCounter {

	private Scanner sc = new Scanner(System.in);
	private String userChoice, userSentence = "";
	private int vowelCounter = 0;
	
	public static void main(String[] args) {
		VowelCounter vC = new VowelCounter();
		vC.run();
	}
	
	public void run() {
		// take in user input for a sentence
		System.out.println("Please Enter A Sentence\nI Will Then Count The Vowels In It!");
		//ignore case
		userSentence = "Hello buddy"; // 3 vowels in example
//		userSentence = sc.nextLine();
		char[] userSentenceArray = userSentence.toLowerCase().toCharArray();
		// count the amount of vowels in the sentence
		for(int i = 0; i < userSentenceArray.length -1; i++) {
			char letter = userSentenceArray[i];
			
			if(letter == 'a') {
				vowelCounter++;
			}
			else if(letter == 'e') {
				vowelCounter++;
			}
			else if(letter == 'i') {
				vowelCounter++;
			}
			else if(letter == 'o') {
				vowelCounter++;
			}
			else if(letter == 'u') {
				vowelCounter++;
			}
			else {
				continue;
			}
			System.out.print(letter + ", ");
			System.out.println();
		}
		//display the total vowel count at the end		
		System.out.println(vowelCounter);
		System.out.println(userSentence);
		
	}
}
