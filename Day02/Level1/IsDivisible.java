import java.util.Scanner;

public class IsDivisible{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		String isDivisible = "";
		
		if(number %5 == 0){
			isDivisible = "Yes";
		}
		else {
			isDivisible = "No";
		}
		
		System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
	}
}