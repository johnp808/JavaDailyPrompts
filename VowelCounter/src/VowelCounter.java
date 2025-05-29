import java.util.Scanner;

public class VowelCounter {

	private Scanner sc = new Scanner(System.in);
	private String userChoice, userSentence = "";
	private int vowelCounter, a, e, i, o, u = 0;
	private boolean running = true;
	
	public static void main(String[] args) {
		VowelCounter vC = new VowelCounter();
		vC.run();
	}
	
	public void run() {
		// take in user input for a sentence
		System.out.println("Please Enter A Sentence\nI Will Then Count The Vowels In It!");
		//ignore case
//		do {
			userSentence = "Hello buddy"; // 3 vowels in example
	//		userSentence = sc.nextLine();
			char[] userSentenceArray = userSentence.toLowerCase().toCharArray();
			// count the amount of vowels in the sentence
			for(int i = 0; i < userSentenceArray.length -1; i++) {
				char letter = userSentenceArray[i];
				
				if(letter == 'a') {
					vowelCounter++;
					a++;
				}
				else if(letter == 'e') {
					vowelCounter++;
					e++;
				}
				else if(letter == 'i') {
					vowelCounter++;
					i++;
				}
				else if(letter == 'o') {
					vowelCounter++;
					o++;
				}
				else if(letter == 'u') {
					vowelCounter++;
					u++;
				}
	//			System.out.print(letter + ", ");
	//			System.out.println();
			}
			//display the total vowel count at the end		
			System.out.println("There Are " + vowelCounter + " Vowels In " + userSentence + "!");
			System.out.println("There Are " + a + " 'A's, " + e + " 'E's, " + i + " 'I's, " 
					 			+ o + " 'O's, " + u + " 'U's, " + "In " + userSentence + "!");
//			running = false;
//		} while(true);
	}
}
