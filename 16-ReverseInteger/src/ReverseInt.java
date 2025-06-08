import java.util.Scanner;

public class ReverseInt {

	private Scanner sc = new Scanner(System.in);
	private int number = 0, digit = 0, reverse = 0, sign = 0;
	private boolean running = true;
	
	public static void main(String[] args) {
		ReverseInt rI = new ReverseInt();
		rI.run();
	}
	
	public void run() {
		inputAndResult();
	}
	
	public void inputAndResult() {
		System.out.println("Please Enter A Positive Or Negative Integer That You Wish To Have Reversed!");
		while(running) {
			try {
				number = sc.nextInt();
				running = false;
			} catch (Exception e) {
				System.out.println("Please Enter An Actual Integer...");
			}
			sc.nextLine();
		}
		System.out.println("Reversed Integer = " + reverseNum(number));
	}
	
	public int reverseNum(int number) {
		sign = number < 0 ? -1 : 1;
		number = Math.abs(number);
		while( number != 0) {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		return sign * reverse;
	}
}
