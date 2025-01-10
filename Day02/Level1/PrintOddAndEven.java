import java.util.Scanner;

public class PrintOddAndEven{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int i = 1;
		
		while(i <= number){
			if(i % 2 == 0){
				System.out.println("Number " + i + " is even");
			}
			else{
				System.out.println("Number " + i + " is odd");
			}
			i++;
		}
	}
}