
public class LongestCommonPrefix {

	private String [] input = new String[10];
	private String firstWord = "", prefix = "";
	private char letter = ' ';
	public static void main(String[] args) {
		LongestCommonPrefix lCP = new LongestCommonPrefix();
		lCP.run();
	}
	
	public void run() {
		enterWords();
		loopWords();
	}
	
	public void enterWords() {
		
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
							System.out.println("Longest Common Prefix: " + prefix);
							return;
						}
					}
				}
				prefix += letter;
		}
		System.out.println(prefix);
	}
}
