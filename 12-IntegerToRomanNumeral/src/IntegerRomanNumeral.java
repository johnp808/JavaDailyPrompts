import java.util.Scanner;

public class IntegerRomanNumeral {

	private Scanner sc = new Scanner(System.in);
	private int input = 0;
	private String romNum = "", play = "";
	private boolean running = true;
	
	public static void main(String[] args) {
		IntegerRomanNumeral iRN = new IntegerRomanNumeral();
		iRN.run();
	}
	
	public void run() {
		System.out.print("Welcome! \nPlease Enter A Positive Whole Number \nI'll Turn It Into Roman Numeral: ");
		do {			
			userInput();
			System.out.println("\n" + input + " Equates To The Roman Numeral: " + calculate() + "\n");
			playAgain();
		} while(running);
	}
	
	public void userInput() {
		while (true | input > 0) {
			try {
				input = sc.nextInt();
				sc.nextLine();
				if(input == 0) {
					System.out.println("Please Enter A Positive Whole Number!");
				}
				else {
					break;
				}
			} 
			catch (Exception e) {
				System.out.println("Please Enter A Positive Whole Number!");
				sc.nextLine();
			}
		}
	}
	
	public String calculate() {
		while(input > 0) {
			
			if(input >= 1000) {
				romNum += "M";
				input -= 1000;
			}
			else if(input >= 900 && input < 1000) {
				romNum += "CM";
				input -= 900;
			}
			else if(input >= 500 && input < 900) {
				romNum += "D";
				input -= 500;
			}
			else if(input >= 400 && input < 500) {
				romNum += "CD";
				input -= 400;
			}
			else if(input >= 100 && input < 400) {
				romNum += "C";
				input -= 100;
			}
			else if(input >= 90 && input < 100) {
				romNum += "XC";
				input -= 90;
			}
			else if(input >= 50 && input < 90) {
				romNum += "L";
				input -= 50;
			}
			else if (input >= 40 && input < 50) {
				romNum += "XL";
				input -= 40;
			}
			else if(input >= 10 && input < 40) {
				romNum += "X";
				input -= 10;
			}
			else if(input >= 9 && input < 10) {
				romNum += "IX";
				input -= 9;
			}
			else if(input >=5 && input < 10) {
				romNum += "V";
				input -= 5;
			}
			else if(input == 4) {
				romNum += "IV";
				input -= 4;
			}
			else if (input <= 3) {
				romNum += "I";
				input--;
			}
		}
		return romNum;
	}
	
	public boolean playAgain() {
		play = "";
		while(!play.equals("1") && !play.equals("2")) {
			System.out.println("Would You Like To Enter A Different Number?\n1) Yes\n2) No");
			play = sc.nextLine();
			
			if(play.equals("1")) {
				System.out.print("Enter A Positive Whole Number: ");
				input = 0;
				romNum = "";
				running = true;
			}
			else if(play.equals("2")) {
				System.out.println("Goodbye!");
				running = false;
			}
			else {
				System.out.println("Please Enter A Valid Option...\n");
			}
		}
		return running;
	}
}
