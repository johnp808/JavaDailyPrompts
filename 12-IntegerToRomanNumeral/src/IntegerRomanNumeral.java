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
		// 1000 = M 500 = D 100 = C 50 = L 10 = X 5 = V 1 = I
		// IV = 4 (not IIII) IX = 9 (not VIIII) XL = 40 XC = 90 CD = 400 CM = 900
		input = 20;
		counter = input;
		while(counter > 0) {
			
			if(counter >= 10 && counter < 40) {
				romNum += "X";
				counter -= 10;
			}
			else if(counter >= 9 && counter < 10) {
				romNum += "IX";
				counter -= 9;
			}
			else if(counter >=5 && counter < 10) {
				romNum += "V";
				counter -= 5;
			}
			else if(counter == 4) {
				romNum += "IV";
				counter -= 4;
			}
			else if (counter <= 3) {
				romNum += "I";
				counter--;
			}
			System.out.println(counter);
		}
		
		System.out.println(romNum);
		
	}
}
