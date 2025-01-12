import java.util.Scanner;

public class SumOfNaturalNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// Checking condition of natural number
		if(number <= 0){
			System.out.println("Provided number is not a natural number");
			return;
		}
		
		// print sum
		System.out.println("The sum  = " + sum(number));
	}
	
	public static int sum(int number){
		
		int sum = 0;
		// using for loop to calculate sum
		for(int i=1; i<=number; i++){
			sum += i;
		}
		
		return sum;
	}
}