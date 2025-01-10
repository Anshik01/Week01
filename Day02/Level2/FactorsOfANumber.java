import java.util.Scanner;

public class FactorsOfANumber {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// iterating from 2 to number using for loop to find the factors of the number
		for (int iterator = 2; iterator <= number; iterator++){
			if (number % iterator == 0) { // if number is completely divisible by iterator
				System.out.print(iterator + " "); // printing the factor
			}
		}
	}
}