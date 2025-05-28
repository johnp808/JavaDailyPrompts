import java.util.Scanner;

public class RandomNumberGuesser {
	
	private Scanner sc = new Scanner(System.in);
	private int guess = 0, answer = 0, count = 0, playAgain = 0;
	private boolean running = true;


	public static void main(String[] args) {
		RandomNumberGuesser rNG = new RandomNumberGuesser();
		rNG.run();
	}
	
	public void run() {
		do {
		// prompt and initialize answer
			guess = 0;
			count = 0;
			answer = (int)((Math.random() * 100) + 1);
			System.out.println("I'm Thinking Of A Number 1-100...\nTake A Guess\n");
//			System.out.println(answer);
			while(guess != answer) {

				try {
					guess = sc.nextInt();
					sc.nextLine();
					count++;
				} 
				catch (Exception e) {
					System.out.println("Please enter a valid number...\n");
					sc.nextLine();
					continue;
				}
				
				if(guess > answer) {
					System.out.println("Too High!\nTry Again!\n");
					continue;
				}
				else if(guess < answer) {
					System.out.println("Too Low!\nTry Again!\n");
					continue;
				}
					System.out.println("Correct! You Guessed It In " + count + " Attempts!\n");
				restart();
			}
		} while(running);
	}
	
	public boolean restart() {
		
		do {
			
			System.out.println("Would You Like To Play Again?\n1) Yes\n2) No");
			
			try {
				playAgain = sc.nextInt();
				sc.nextLine();
			}
			catch(Exception exc) {
				System.out.println("Please Select A Valid Option...");
				sc.nextLine();
			}
			System.out.println();
			
		} while(playAgain != 1 && playAgain != 2);
		
		if (playAgain == 1) {
			return running;
		}
		else {
			System.out.println("Thanks For Playing See You Next Time!");
			return running = false;
		}
	}
	
}
