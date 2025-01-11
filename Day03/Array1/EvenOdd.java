// importing Scanner class to take the input
import java.util.Scanner;

public class EvenOdd{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// Condition to check natural number
		if(number <= 0){
			System.out.println("The given number is not a natural number");
			return;
		}
		
		// Creating two different arrays for both odd and even numbers
		int[]oddNumber = new int[number/2 +1];
		int[]evenNumber = new int[number/2 +1];
		
		// Defining two pointers to pointers for both the arrays
		int oddIndex = 0;
		int evenIndex = 0;
		
		for(int i=1; i<=number; i++){
			if(i % 2 == 0){
				evenNumber[evenIndex++] = i;
			}
			else{
				oddNumber[oddIndex++] = i; 
			}
		}
		
		System.out.println("Odd numbers are ");
		
		for(int i=0; i<oddIndex; i++){
			System.out.print(oddNumber[i] + " ");
		}
		System.out.println();
		
		System.out.println("Even numbers are ");
		
		for(int i=0; i<evenIndex; i++){
			System.out.print(evenNumber[i] + " ");
		}
	}
}

