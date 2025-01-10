import java.util.Scanner;

public class PowerOfANumber {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two integer variables, base, and exponent, and taking input for them
		int base = input.nextInt();
		int exponent = input.nextInt();		
		
		// created an integer variable to store the result of base to the power exponent
		int baseToThePowerExponent = 1;
		
		// iterating from 1 to exponent using for loop to find the result
		for (int iterator = 1; iterator <= exponent; iterator++){
			baseToThePowerExponent = baseToThePowerExponent * base;
		}
		
		// displaying the output
		System.out.println(base + " to the power " + exponent + " is equal to " + baseToThePowerExponent);
	}
}