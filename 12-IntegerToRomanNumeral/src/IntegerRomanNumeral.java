import java.util.Scanner;

public class IntegerRomanNumeral {

	private Scanner sc = new Scanner(System.in);
	private int input = 0, counter =0;
	private String romNum = "";
	
	public static void main(String[] args) {
		IntegerRomanNumeral iRN = new IntegerRomanNumeral();
		iRN.run();
	}
	
	public void run() {
		// take in user entry
		// 1000 = M 500 = D 100 = C 50 = L 10 = X 5 = V 1 = I
		// IV = 4 (not IIII) IX = 9 (not VIIII) XL = 40 XC = 90 CD = 400 CM = 900
		input = 3;
		counter = input;
		for(int i = 0; i < input; i++) {
			if(input < 5) {
				romNum += "I";
				counter--;
			}
		}
		
		System.out.println(romNum);
		
	}
}
