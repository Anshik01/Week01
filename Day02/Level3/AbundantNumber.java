import java.util.Scanner;

public class AbundantNumber {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// created an integer variable, sum: to store sum of digits of number
		int sum = 0;
		
		// iteration through each digit of number using for loop
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i; // adding the divisor of number to sum
			}
		}
		
		// displaying the output 
		if (number < sum) {
			System.out.println(number + " is an Abundant Number");
		} else {
			System.out.println(number + " is not an Abundant Number");
		}
	}
}