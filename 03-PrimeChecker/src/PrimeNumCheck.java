import java.util.Scanner;

public class PrimeNumCheck {

	private Scanner sc = new Scanner(System.in);
	private boolean running = true;
	private String input = "";
	private int number = 0;
	private int counter = 0;
	
	public static void main (String[] args) {
		PrimeNumCheck pNC = new PrimeNumCheck();
		pNC.run();
	}
	
	public void run() {
		
		System.out.println("Prime Number Checker! \n\nEnter A Number To Find Out If It's A Prime Number!\n\n[Press Enter]");
		sc.nextLine();
		
		do {
		System.out.println("Enter A Number...");
		System.out.println();
		try {
			input = sc.nextLine();
			number = Integer.parseInt(input);
		}
		catch(NumberFormatException exc) {
			System.out.println("\nPlease Enter A Valid Number!\n");
			continue;
		}
		if(number < 0) {
			System.out.println("Choose A Positive Number!\n");
			continue;
		}
		for(int i = 2; i < number; i++) {
			if(number % i == 0 ) {
				counter++;
				if(counter >= 1) {
					break;
				} 
			}
		}

		System.out.println();
		int randNum = ((int)(Math.random() * 5) + 1) * 500;
		
		try {
			System.out.println("Calculating...\n");
			Thread.sleep(randNum);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(number == 1) {
			System.out.println((int) number + " Is Not A Prime Number!");
		}
		else if(counter >= 1) {
			System.out.println((int) number + " Is Not A Prime Number!");
		}
		else {
			System.out.println((int) number + " Is A Prime Number!");
		}
		System.out.println();
		playAgain();
		
		} while(running);
	}
	
	public void playAgain() {
		int playAgain = 0;
		
		do {
			System.out.println("Would You Like To Try Another Number?\n\n1) Yes\n\n2) No\n");
			
			try {
				input = sc.nextLine();
				playAgain = Integer.parseInt(input);
			}
			catch(NumberFormatException exc ) {
				System.out.println("\nPlease Enter A Valid Option...\n");
				continue;
			}
			
			if(playAgain == 1) {
				counter = 0;
			}
			else if(playAgain == 2) {
				System.out.println("\nGoodbye...");
				running = false;
			}
			else {
				System.out.println("\nPlease Select One Of The Options...");
			}
			
			System.out.println();
		} while(playAgain != 1 && playAgain != 2);
	}
}
