import java.util.Scanner;

public class GreatestFactor {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// created an integer variable to store the greatest factor of the number
		int greatestFactorOfNumber = 1;
		
		// iterating from number to 0 using for loop to find the greatest factor of number
		for (int iterator = number-1; iterator > 0; iterator--){
			if (number % iterator == 0) { // if number is completely divisible by iterator
				greatestFactorOfNumber = iterator;
				break; // no need to iterate further
			}
		}
		
		// displaying the output
		System.out.println("greatest factor of " + number + " is " + greatestFactorOfNumber);
	}
}