import java.util.Scanner;

public class ReverseArray{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// Store the number that is to be reversed
		int number = sc.nextInt();
		// Creating a copy of number to find the number of digit
		int temp = number;
		
		int numberOfDigit = 0;
		while(temp != 0){
			temp /= 10;
			numberOfDigit++;
		}
		
		int[]digits = new int[numberOfDigit];
		
		// Reverse the digit and store in an array
		for(int i=0; i<numberOfDigit; i++){
			digits[i] = number%10;
			number /= 10;
		}
		
		//Print the value of reverse array
		for(int i=0; i<digits.length; i++){
			System.out.print(digits[i] + " ");
		}
	}
}