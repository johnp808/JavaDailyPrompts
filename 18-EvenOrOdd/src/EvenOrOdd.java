import java.util.Scanner;

public class EvenOrOdd {

	private Scanner sc = new Scanner(System.in);
	private int number = 0;
	private String userInput = "", result = "";
	
	public static void main(String[] args) {
		EvenOrOdd eOO = new EvenOrOdd();
		eOO.run();
	}
	
	public void run() {
		do {
			System.out.println("Please Enter A Number I Will Check If It Is Even Or Odd.");
			userInput();
			System.out.println(check() + "\n");
		}while(playAgain());
	}
	
	public void userInput() {
		while(true) {
			try {
				number = Integer.parseInt(sc.nextLine());
				if(number == 0) {
					System.out.println("Please Enter A Number Other Than 0...");
				}
				else {
					break;
				}
			}
			catch(Exception exc) {
				System.out.println("Please Enter A Valid Number...");
			}
		}
	}
	
	public String check() {
		if (number % 2 == 0) {
			if(number > 0) {
				result = "Result: " + number + " is A Positive Even Number";
			}
			else {
				result = "Result: " + number + " is A Negative Even Number";
			}
			return result;
		}
		else {
			if(number > 0) {
				result = "Result: " + number + " is A Positive Odd Number";
			}
			else {
				result = "Result: " + number + " is A Negative Odd Number";
			}
			return result;
		}
	}
	
	public boolean playAgain() {
		while(true) {
			System.out.println("Would You Like To Enter Another Number?\n1) Yes\n2) No");
			userInput = sc.nextLine();
			if(userInput.equals("1")) {
				return true;
			}
			else if(userInput.equals("2")) {
				System.out.println("GoodBye");
				return false;
			}
			else {
				System.out.println("\nPlease Enter A Valid Input\n");
			}
		}
	}
}
