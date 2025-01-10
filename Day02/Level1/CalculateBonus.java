import java.util.Scanner;

public class CalculateBonus{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int yearOfService = sc.nextInt();
		
		int bonus = 0;
		
		if(yearOfService > 5){
			bonus = salary / 20;
		}
		
		System.out.println("Bonus amount for the employee is " + bonus);
	}
}