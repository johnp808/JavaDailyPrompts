import java.util.Scanner;

public class Calculator {

	private Scanner sc = new Scanner(System.in);
	private double firstDouble = 0, secondDouble = 0, sum = 0;
	private String expression = "", answer ="", userInput = "";
	private boolean running = true;
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.run();
	}
	
	public void run() {
		System.out.println("Welcome To The Calculator!");
		while(running) {
		userInput();
		result();
		runAgain();
		}
	}
	
	public void userInput() {
		firstNumber();
		expressionChoice();
		secondNumber();
	}
	
	public void firstNumber() {
		while(true) {
			System.out.print("Please Enter Your First Positive Integer:");
			try {
				firstDouble = sc.nextDouble();
				if(firstDouble < 0) {
					System.out.println("Please Enter A Positive Integer...\n");
					sc.nextLine();
					continue;
				}
				sc.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("Please Enter An Integer...\n");
			}
			sc.nextLine();
		}
	}
	
	public void expressionChoice() {
		while(true) {
			System.out.print("\nPlease Enter The Expression You Would Like To Use:");
			expression = sc.nextLine();
			if(expression.equals("+") || 
					expression.equals("add") || 
					expression.equals("plus") || 
					expression.equals("addition") ||
					expression.equals("-") || 
					expression.equals("sub") || 
					expression.equals("minus") || 
					expression.equals("subtract") ||
					expression.equals("*") || 
					expression.equals("multiply") ||
					expression.equals("times") ||
					expression.equals("/") || 
					expression.equals("divide")) {
				System.out.println();
				break;
			}
			else {
				System.out.println("Please Enter A Valid Expression...");
				continue;
			}
		}
	}
	
	public void secondNumber() {
		while(true) {
			System.out.print("Please Enter Your Second Positive Integer:");
			try {
				secondDouble = sc.nextDouble();
				if(secondDouble < 0) {
					System.out.println("Please Enter A Positive Integer...\n");
					sc.nextLine();
					continue;
				}
				sc.nextLine();
				break;
			} 
			catch (Exception e) {
				System.out.println("Please Enter An Integer...");
			}
			sc.nextLine();
			System.out.println();
		}
	}
	
	public String add () {
		sum = firstDouble + secondDouble;
		if(sum % 1 == 0) {
			answer =  (int)firstDouble + " + " + (int)secondDouble + " = " + (int)sum;
			return answer;
		}
		else {
			answer =  firstDouble + " + " + secondDouble + " = " + sum;
			return answer;
		}
	}
	
	public String subtract () {
		sum = firstDouble - secondDouble;
		if(sum % 1 == 0) {
			answer =  (int)firstDouble + " - " + (int)secondDouble + " = " + (int)sum;
			return answer;
		}
		else if(sum == 0) {
			answer =  firstDouble + " - " + secondDouble + " = " + (int)sum;
			return answer;
		}
		else {
			answer =  firstDouble + " - " + secondDouble + " = " + sum;
			return answer;
		}
	}
	
	public String multiply () {
		sum = firstDouble * secondDouble;
		if(sum % 1 == 0) {
			answer =  (int)firstDouble + " * " + (int)secondDouble + " = " + (int)sum;
			return answer;
		}
		else if(sum == 0) {
			answer =  firstDouble + " * " + secondDouble + " = " + (int)sum;
			return answer;
		}
		else {
			answer =  firstDouble + " * " + secondDouble + " = " + sum;
			return answer;
		}
	}
	
	public String divide () {
		sum = firstDouble / secondDouble;
		if(sum % 1 == 0) {
			answer =  (int)firstDouble + " / " + (int)secondDouble + " = " + (int)sum;
			return answer;
		}
		else if(sum == 0) {
			answer =  firstDouble + " / " + secondDouble + " = " + (int)sum;
			return answer;
		}
		else {
			answer =  firstDouble + " / " + secondDouble + " = " + sum;
			return answer;
		}
	}
	
	public void result() {
		System.out.println();
		if(expression.equals("+") || 
			expression.equals("add") || 
			expression.equals("plus") || 
			expression.equals("addition")) {
				System.out.println(add());
		}
		if(expression.equals("-") || 
			expression.equals("sub") || 
			expression.equals("minus") || 
			expression.equals("subtract")) {
				System.out.println(subtract());
		}
		if(expression.equals("*") || 
			expression.equals("multiply") ||
			expression.equals("times")) {
				System.out.println(multiply());
		}
		if(expression.equals("/") || 
			expression.equals("divide")) {
				System.out.println(divide());
		}
		System.out.println();
	}
	
	public boolean runAgain() {
		while(!userInput.equals("1") || !userInput.equals("2")) {
			System.out.println("Would You Like To Calculate Another Number?\n1) Yes\n2) No");
			userInput = sc.nextLine();
			if(userInput.equals("1")) {
				firstDouble = 0;
				secondDouble = 0;
				sum =0;
				break;
			}
			else if(userInput.equals("2")) {
				System.out.println("Goodbye!");
				running = false;
				break;
			}
			else {
				System.out.println("\nPlease Enter A Valid Entry...\n");
				continue;
			}
		}
		return running;
	}
}
