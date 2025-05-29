import java.util.Scanner;

public class VowelCounter {

	private Scanner sc = new Scanner(System.in);
	private String userChoice = "", userSentence = "";
	private int vowelCounter, a, e, i, o, u = 0;
	
	public static void main(String[] args) {
		VowelCounter vC = new VowelCounter();
		vC.run();
	}
	
	public void run() {
		System.out.println("Please Enter A Sentence\nI Will Then Count The Vowels In It!\n");
		
		do {
			userSentence = sc.nextLine();
			char[] userSentenceArray = userSentence.toLowerCase().toCharArray();
			for(int j = 0; j < userSentenceArray.length; j++) {
				char letter = userSentenceArray[j];
				
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
			}
			
			System.out.println("There Are " + vowelCounter + " Vowels In " + userSentence + "!\n");
			System.out.print("Vowels In " + userSentence + ":\n");
			if(a > 0) System.out.print(a + " 'A'" + (a == 1 ? "" : "s") + ", ");
			if(e > 0) System.out.print(e + " 'E'" + (e == 1 ? "" : "s") + ", ");
			if(i > 0) System.out.print(i + " 'I'" + (i == 1 ? "" : "s") + ", ");
			if(o > 0) System.out.print(o + " 'O'" + (o == 1 ? "" : "s") + ", ");
			if(u > 0) System.out.print(u + " 'U'" + (u == 1 ? "" : "s"));
			System.out.println("\n");
			
			while(!userChoice.equals("1") && !userChoice.equals("2")) {
				System.out.println("Would you like to try another Sentence?\n1) Yes\n2) No\n");
				userChoice = sc.nextLine();
				
				if (userChoice.equals("1")) {
					System.out.println("Enter Another Sentence:");
					vowelCounter = 0;
					a = 0;
					e = 0;
					i = 0;
					o = 0;
					u = 0;
				}
				else if (userChoice.equals("2")) {
					System.out.println("Thanks For Playing!\n\nGoodbye!");
				}
				else {
					System.out.println("Please Enter A Valid Option...\n");
				}
			}
			
			userChoice = "";
		} while(true);
	}
}
