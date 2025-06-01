import java.util.Scanner;

public class PangramChecker {
	
	private Scanner sc = new Scanner(System.in);
	private String sentence = "";
	private int[] charsCheck = new int[250];

	public static void main(String[] args) {
		PangramChecker pC = new PangramChecker();
		pC.run();
	}
	
	public void run() {
		System.out.print("Welcome To The Panagram Checker!\nPlease Enter A Sentence I Can Check:");
		sentence = sc.nextLine().toUpperCase();
		System.out.println();
		boolean isPangram = panCheck();
		
		if (isPangram) {
			System.out.println(sentence.toLowerCase() + " Is A Pangram!");
		}
		else {
			System.out.println(sentence.toLowerCase() + " Is Not A Pangram!");
		}
	}
	
	public boolean panCheck() {
		for(int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				charsCheck[c]++;				
			}
		}
		
		for(char c = 'A'; c <= 'Z'; c++) {
			if(charsCheck[c] == 0) {
				return false;
			}
		}
			return true;
	}

}
