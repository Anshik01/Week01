import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// Creating multiplication table to add table of a number
		int[]multiplication = new int[10];
		
		for(int i=1; i<=10; i++){
			// We are doing i-1 to avoid array out of boud exception
			multiplication[i-1] = number * i;
			
			System.out.println(number + " x " + i + " = " + multiplication[i-1]);
		}
	}
}