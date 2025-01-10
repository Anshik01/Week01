import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two integer variables, and a String variable, and taking input for them
		int number1 = input.nextInt(); 
		int number2 = input.nextInt();
		String operator = input.next(); 
		
		// displaying the output based on input variables and operator
		switch (operator) {
			case "+" : // if the operator is addition operator
				System.out.println("the answer is " + (number1 + number2));
				break;
			
			case "-" : //if the operator is subtraction operator
				System.out.println("the answer is " + (number1 - number2));
				break;
				
			case "*" : //if the operator is multiplication operator
				System.out.println("the answer is " + (number1 * number2));
				break;
				
			case "/" : //if the operator is division operator
				System.out.println("the answer is " + (number1 / number2));
				break;
				
			default : 
				System.out.println("It is an Invalid Operator");
				break;
		}
	}
}