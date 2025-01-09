import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		// We are taking the inputs in cm
		
		double cmBase = input.nextDouble();
		double cmHeight = input.nextDouble();
		
		double inchBase = cmBase / 2.54;
		double inchHeight = cmHeight / 2.54;
		
		// Area of triangle = 1/2 * base * height;
		
		double sqInchArea = 1.0/2.0 * inchBase * inchHeight;
		double sqCmArea = 1.0/2.0 * cmBase * cmHeight;
		
		System.out.println("The area of triangle in square inch is " + sqInchArea + " and in square centimeter is " + sqCmArea);
	}
}

