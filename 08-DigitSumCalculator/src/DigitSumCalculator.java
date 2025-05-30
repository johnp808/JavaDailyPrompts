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
		System.out.print("Lets Calculate The Sum Of All The Digits From A Number You Enter!\n\nEnter A Whole Number: ");
		do {
		userNum = getNumber();
		numStr = String.valueOf(userNum);
		System.out.println("The sum of the digits in " + userNum + " is " + calculate());
		System.out.println(equation + sum);
		System.out.println();
		} while(!userInput.equals("1") && !userInput.equals("2"));
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
