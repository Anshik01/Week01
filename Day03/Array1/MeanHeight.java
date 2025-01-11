//importing scanner class to take the input 
import java.util.Scanner;

public class MeanHeight{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		// Creating an array with capacity of 11 to store height 
		double[]height = new double[11];
		double sumOfHeight = 0.0;
		
		for(int i=0; i<11; i++){
			height[i] = sc.nextDouble();
			sumOfHeight += height[i];
		}
		
		// mean = sum of all elements / number of elements
		double mean = sumOfHeight / 11;
		
		System.out.println("Mean height of players is " + mean);
	}
}