import java.util.Scanner;

public class CmToFeet{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double cmHeight = input.nextDouble();
		
		// 1 foot = 12 inches and 1 inch = 2.54 cm
		
		double inchHeight = cmHeight / 2.54;
		double feetHeight = inchHeight / 12;
		
		System.out.println("Your Height in cm is " + cmHeight + " while in feet is " + feetHeight + " and inches is " + inchHeight);
	}
}

