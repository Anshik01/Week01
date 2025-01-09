import java.util.Scanner;

public class DoubleOpt{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double expression1 = a + b *c;
		double expression2 = a * b + c; 
		double expression3 = c + a / b;
		double expression4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + expression1 + "," +expression2 + "," + expression3 + " ,and " + expression4);
	}
}