import java.util.Scanner;

public class NaturalNumSum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int sum = 0;
		// A sum of n natural numbers is n * (n+1) / 2 
		
		if(number >= 1){
			sum = number * (number + 1) / 2;
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}