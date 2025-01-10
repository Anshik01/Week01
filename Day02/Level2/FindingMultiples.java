import java.util.Scanner;

public class FindingMultiples {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// iterating from 100 to number using for loop to find multiples of the number below 100
		for (int iterator = 100; iterator >= number; iterator--){
			if (iterator % number == 0) { // if iterator is completely divisible by number
				System.out.print(iterator + " "); // printing the multiples
			}
		}
	}
}