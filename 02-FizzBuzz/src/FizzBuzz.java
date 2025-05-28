
public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		
		fb.run();
	}
	
	public void run() {
		System.out.println("lets get started with FizzBuzz");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
		
	}
}
