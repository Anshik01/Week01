import java.util.Scanner;

public class IntOperation {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int expression1 = a + b *c;
		int expression2 = a * b + c; 
		int expression3 = c + a / b;
		int expression4 = a % b + c;
		
		System.out.println("The results of Int Operations are " + expression1 + "," +expression2 + "," + expression3 + " ,and " + expression4);
	}
}