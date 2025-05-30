import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitSumCalculator {

	private Scanner scanner = new Scanner(System.in);
	private int sum = 0, userNum = 0, userInput;
	private boolean running = true;

	public static void main(String[] args) {
		DigitSumCalculator dSC = new DigitSumCalculator();
		dSC.run();
	}
	
	public void run() {
		System.out.print("Lets Calculate The Sum Of All The Digits From A Number You Enter!\n\nEnter A Whole Number: ");
//		userNum = 123; // 6
		userNum = getNumber();
		System.out.println(userNum);
	}
	
	public int calculate() {
		return 0;
	}
	
	public int getNumber() {
		while(running) {
			try {
				userInput = scanner.nextInt();
				running = false;
			} 
			catch (InputMismatchException exc) {
				System.out.println("\nPlease Enter A Real Number!\n");
			}
			if(userInput < 0 ) {
				System.out.println("Please Enter A Positive Whole Number");
				running = true;
			}
			scanner.nextLine();
		}
		return userInput;
	}
}
