import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for them
		int number = input.nextInt();
		
		// checking if the number is prime or not using for loop
		boolean check = true;
		for (int i = 2; i < number; i++){
			if (number % i == 0) { // if number is divisible by any other number than 1 or itself then it is not a prime number
				check = false;
				break; // no need to iterate further
			}
		}
		
		// displaying the output
		if (check) { // if check is still true then number is prime
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}
}