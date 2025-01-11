import java.util.Scanner;

public class SumOfArray{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		double[]numbers = new double[10];
		int i=0;
		
		while(true){
			if(i >= 10) break;
			
			double userInput = sc.nextDouble();
			
			if(userInput <= 0){
				break;
			}
			
			numbers[i] = userInput;
			sum += userInput;
			i++;
		}
		
		System.out.println("The input numbers are : ");
		
		for(int j=0; j<i; j++){
			System.out.print(numbers[j] + " ");
		}
		System.out.println();
		System.out.println("The sum of the above numbers are " + sum);
		
	}
}