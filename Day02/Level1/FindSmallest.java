import java.util.Scanner;

public class is{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		String isSmallest = "";
		
		if(Math.min(Math.min(number1, number2), number3) == number1){
			isSmallest = "Yes";
		}
		else{
			isSmallest = "No";
		}
		
		System.out.println(" Is the first number the smallest? " + isSmallest);
	}
}