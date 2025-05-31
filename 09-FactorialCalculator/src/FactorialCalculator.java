import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialCalculator {

	private Scanner sc = new Scanner(System.in);
	private int userNum = 0, sum = 0, decreasingValue = 0;
	private String userInput = "", equation = "";
	private boolean running = true, positiveNum = true;
	
	
	public static void main(String[] args) {
		FactorialCalculator fC = new FactorialCalculator();
		fC.run();
	}
	
	public void run() {
		System.out.println("Hello!\nThis Is The Factorial Calculator");
		System.out.println("Please Enter A Non-Negative Integer:");
		while(true) {
			userInput = "";
			userNum = getNumber();
			calculate();
			System.out.println("\n" + equation + sum + "\n");
			playAgain();
		}
	}
	
	public int getNumber() {
		while(running) {
			try {
				userNum = sc.nextInt();
				running = false;
				positiveNum = true;
			} 
			catch (InputMismatchException exc) {
				System.out.println("Please Enter A Real Number!");
				positiveNum = false;
			}
			if(userNum < 0 && positiveNum) {
				System.out.println("Please Enter A Positive Whole Number");
				running = true;
			}
			sc.nextLine();
		}
		return userNum;
	}
	
	public void calculate() {
		decreasingValue = userNum;
		if(userNum == 0 || userNum == 1) {
			sum = 1;
			equation = userNum + " = ";
		}
		
		else {
			for(int i = 0; i < userNum; i++) {
				if(i == 0) {
					sum = decreasingValue;
					decreasingValue--;
					equation = sum + " * ";
				}
				else if(i > 0) {
					
					sum *= decreasingValue;
					
					if(i != userNum - 1) {
						equation += decreasingValue + " * "; 
					}
					
					else {
						equation += decreasingValue + " = ";
					}
					decreasingValue--;
				}
			}
		}
	}
	
	public void playAgain() {
		
		while(!userInput.equals("1") && !userInput.equals("2")) {
			System.out.println("Would You Like To Play Again?\n1) Yes\n2) No\n");
			userInput = sc.nextLine();
			running = true;
			if(userInput.equals("1")) {
				System.out.println("Please Enter Another Number:");
				break;
			}
			if(userInput.equals("2")) {
				System.out.println("\nGoodbye!");
				System.exit(0);
			}
			else {
				System.out.println("Please Select An Option From The List...\n");
			}
		}
	}
}
