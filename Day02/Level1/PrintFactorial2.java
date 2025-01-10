import java.util.Scanner;

public class PrintFactorial2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int fact = 1;
		
		for(int i=number; i>=1; i--){
			fact = fact * i;
		}
		
		System.out.println("The factorial of given number is " + fact);
	}
}