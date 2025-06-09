import java.util.Scanner;

public class FibNumGen {

	private int first = 0, second = 1, next = 0, input = 0;
	private Scanner sc = new Scanner(System.in);
	private String output = "", userInput;
	
	public static void main(String[] args) {
		FibNumGen fNG = new FibNumGen();
		fNG.run();
	}
	
	public void run() {
		do {
			reset();
			System.out.println("Please Enter How Many Fibonacci Numbers You Would Like To Generate:");
			userInput();
			calculate();
			System.out.println("Input: " + input);
			System.out.println("Result: " + output + "\n");
		} while(playAgain());
	}
	
	public void userInput() {
		while(true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				if(input <= 0) {
					System.out.println("Please Enter A Number Greater Than 0...");
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
	
	public void calculate() {
		
		if(input == 1) {
			output = "" + first;
		}
		else if(input == 2) {
			output = first + " " + second;
		}
		else if (input > 2) {
			output = first + " " + second;
			for(int i = 0; i < input - 2; i++) {
			next = first + second;
			output += " " + next;
			first = second;
			second = next;
			}
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
	
	public void reset() {
		first = 0;
		second = 1;
		next = 0;
		input = 0;
		output = "";
	}
}
