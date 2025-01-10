import java.util.Scanner;

public class AddNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		
		while(true){
			double userInput = sc.nextDouble();
			
			if(userInput == 0){
				break;
			}
			
			sum += userInput;
		}
		
		System.out.println("Sum of all the numbers entered by user is " + sum);
	}
}