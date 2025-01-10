import java.util.Scanner;

public class FizzBuzzUsingWhileLoop {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// iterating from 0 to number using while loop
		// created an integer variable for iteration
		int iterator = 0;
		while (iterator <= number){
			if ((iterator % 3 == 0) && (iterator % 5 == 0)) { // if number is divisible by 3 and 5 both
				System.out.print("FizzBuzz "); 
			} else if (iterator % 3 == 0) { // if number is divisible by 3 only
				System.out.print("Fizz ");
			} else if (iterator % 5 == 0) { // if number is divisible by 5 only
				System.out.print("Buzz ");
			} else {
				System.out.print(iterator + " ");
			}
			iterator++; // increasing the value of iterator
		}
	}
}