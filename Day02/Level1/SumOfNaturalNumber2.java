import java.util.Scanner;

public class SumOfNaturalNumber2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int formulaSum = 0;
		int loopSum = 0;
		// A sum of n natural numbers is n * (n+1) / 2 
		
		if(number >= 1){
			formulaSum = number * (number + 1) / 2;
			
			for(int i=number; i>= 1; i--){
				loopSum += i;
			}
			
			System.out.println("Sum calculated using for loop is " + loopSum + " and by using formula is " + formulaSum + ". Both are same.");
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}