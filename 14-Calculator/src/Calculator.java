import java.util.Scanner;

public class Calculator {

	private Scanner sc = new Scanner(System.in);
	private double firstDouble = 0, secondDouble = 0, result = 0;
	private String expression = "";
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.run();
	}
	
	public void run() {
		System.out.println("Welcome To The Calculator!");
		System.out.print("\nPlease Enter Your First Positive Integer:");
		firstDouble = sc.nextDouble();
		sc.nextLine();
		System.out.print("\nPlease Enter The Expression You Would Like To Use:");
		expression = sc.nextLine();
		System.out.print("\nPlease Enter Your Second Positive Integer:");
		secondDouble = sc.nextDouble();
		sc.nextLine();
	}
	
	public double add () {
		return 0;
	}
	
	
	public double subtract () {
		return 0;
	}
	
	
	public double multiply () {
		return 0;
	}
	
	
	public double divide () {
		return 0;
	}
	
	
}
