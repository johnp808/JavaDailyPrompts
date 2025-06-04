import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	private Scanner sc = new Scanner(System.in);
	private String input = "";
	private Stack<Character> stack = new Stack<>();
	
	public static void main(String[] args) {
		ValidParentheses vP = new ValidParentheses();
		System.out.println("Please Enter A String Containing Any Combination Of: \nParentheses (), square brackets [], and curly braces {}\n"
				+ "I will check if all the symbols are balanced and properly nested... \nEx:\t({[]}) → Valid \n\t([)] → Invalid");
		System.out.println("The Results Are: " + vP.run());
	}
	
	public boolean run() {
		input = sc.nextLine();
		
		for (int i =0; i < input.length(); i++) {
			char symbol = input.charAt(i);
			
			if (symbol == '(' || symbol == '{'  || symbol == '[') {
				stack.push(symbol);
			}
			
			else if (symbol == ')' || symbol == '}' || symbol == ']') {
				
				if (stack.isEmpty()) {
					return false;
				}
				
				else if(symbol == ')' && stack.peek() == '(' ||
						symbol == '}' && stack.peek() == '{' ||
						symbol == ']' && stack.peek() == '[') {
						
					stack.pop();
				}
				
				else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
