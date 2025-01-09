import java.util.Scanner;

public class ConvertToYardAndMile{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();
		
		// 1 mile = 1760 yards and 1 yard = 3 feet

		double yard = feet / 3.0;
		double mile = yard / 1760.0;
		
		System.out.println("Your length in feet is " + feet + " while in yard is " + yard + " and in miles is " + mile);
	}
}

