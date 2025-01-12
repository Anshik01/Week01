import java.util.Scanner;
import java.lang.Math;

public class FactorsOfANumber {
	
	static int[] factors(int number) {
		// created an integer variable, noOfFactors, to get the count of factors of number
		int noOfFactors = 0;
		
		// iterating from 2 to number using for loop to find the factors of the number
		for (int iterator = 2; iterator < number; iterator++){
			if (number % iterator == 0) { // if number is completely divisible by iterator
				noOfFactors++;
			}
		}
		
		// created an array to store the factors of the number
		int [] factors = new int [noOfFactors];
		
		// iterating from 2 to number using for loop to find the factors of the number
		int factorsIterator = 0;
		for (int iterator = 2; iterator < number; iterator++){
			if (number % iterator == 0) { // if number is completely divisible by iterator
				factors [factorsIterator] = iterator;
				factorsIterator++;
			}
		}
		
		return factors; // returning factors array
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		int [] factorsOfNumber = factors (number); // calling factors function
		int sumOfFactors = 0; // for storing the sum of factors 
		int sumOfSquares = 0; // for storing the sum of square of factors
		int sumOfProducts = 1; // for storing the product of factors
		
		// iteration for finding the sum of factors
		
		System.out.print("factors: ");
		for(int iterator = 0; iterator < factorsOfNumber.length; iterator++) {
			System.out.print(factorsOfNumber [iterator] + " "); // printing the factors
			sumOfFactors += factorsOfNumber [iterator];
			sumOfSquares += Math.pow(factorsOfNumber [iterator], 2);
			sumOfProducts *= factorsOfNumber [iterator];
		}
		
		System.out.println();
		System.out.println("Sum of factors: " + sumOfFactors);
		System.out.println("Sum of squares of factors: " + sumOfSquares);
		System.out.println("Sum of product of factors: " + sumOfProducts);
		
		input.close(); // closing the scanner object
	}
}