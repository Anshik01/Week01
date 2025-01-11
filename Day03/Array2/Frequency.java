import java.util.Scanner;

public class Frequency {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created an array to store the frequency of digits in the number
		int[] frequency = new int[10];
		
		// iterating using while loop through the number
		while (number > 0) {
			int unitPlaceDigit = number % 10;
			frequency[unitPlaceDigit]++;
			number /= 10;
		}
		
		// printing the frequency of each number
		for (int iterator=0; iterator<10; iterator++) {
			System.out.println(iterator + " : " + frequency[iterator]);
		}
		
		input.close();
	}
}