import java.util.Scanner;

public class CheckNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// input a number
		int number = sc.nextInt();
		
		/*
			positive value = 1
			negative value = -1
			zero = 0
		*/
		
		System.out.println(numberCheck(number));
	}
	
	public static int numberCheck(int number){
		
		// Conditions to check wheather the number is positive, negative or zero
		
		if(number > 0) {
			return 1;
		}
		else if (number < 0){
			return -1;
		}
		else{
			return 0;
		}
	}
}