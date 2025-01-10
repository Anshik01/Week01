import java.util.Scanner;

public class PrintFactorial{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int fact = 1;
		
		while(number >= 1){
			fact = fact * number;
			number --;
		}
		
		System.out.println("The factorial of given number is " + fact);
	}
}