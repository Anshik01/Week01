import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// iterating from 0 to number using for loop
		for (int i = 0; i <= number; i++){
			if ((i % 3 == 0) && (i % 5 == 0)) { // if number is divisible by 3 and 5 both
				System.out.print("FizzBuzz "); 
			} else if (i % 3 == 0) { // if number is divisible by 3 only
				System.out.print("Fizz ");
			} else if (i % 5 == 0) { // if number is divisible by 5 only
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}