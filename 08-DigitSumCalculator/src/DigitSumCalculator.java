import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitSumCalculator {

	private Scanner scanner = new Scanner(System.in);
	private String  numStr = "", equation = "", userInput = "";
	private int sum = 0, userNum = 0;
	private boolean running = true;

	public static void main(String[] args) {
		DigitSumCalculator dSC = new DigitSumCalculator();
		dSC.run();
	}
	
	public void run() {
		System.out.print("Lets Calculate The Sum Of All The Digits From A Number You Enter!\n\nEnter A Positive Whole Number: ");
		do {
			userNum = getNumber();
			numStr = String.valueOf(userNum);
			System.out.println("\nThe sum of the digits in " + userNum + " is " + calculate());
			System.out.println(equation + sum + "\n");
			do {
				System.out.println("Would You Like To Try A Different Number?\n1) Yes\n2) No\n");
				userInput = scanner.nextLine();
				if(userInput.equals("1")) {
					System.out.print("Enter A New Positive Whole Number: ");
					running = true;
					equation = "";
					sum = 0;
				}
				else if(userInput.equals("2")) {
					System.exit(0);
				}
				else {
					System.out.println("Please Enter A Valid Option...\n");
				}
				
			} while(!userInput.equals("1") && !userInput.equals("2"));
		}while(userInput.equals("1"));
	}
	public int calculate() {
		
		for(int i = 0; i < numStr.length();i++) {
			char number = numStr.charAt(i);
			int singleDigit = Character.getNumericValue(number); 
			sum = sum + singleDigit;
			equation += number + (i < numStr.length() - 1 ? " + " : " = ");
		}
		return sum;
	}
	
	public int getNumber() {
		while(running) {
			try {
				userNum = scanner.nextInt();
				running = false;
			} 
			catch (InputMismatchException exc) {
				System.out.println("\nPlease Enter A Real Number!\n");
			}
			if(userNum < 0 ) {
				System.out.println("Please Enter A Positive Whole Number");
				running = true;
			}
			scanner.nextLine();
		}
		return userNum;
	}
}
