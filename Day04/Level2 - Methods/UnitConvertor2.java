// importing scanner class for taking inputs from user
import java.util.Scanner;

public class UnitConvertor2 {
	
	// various scale changing functions
	static void yards2feet (double yards){
		double feet = yards * 3;
		System.out.println("The total feet is " + feet + " for the given " + yards + " yards");
	}
	
	static void feet2yards (double feet) {
		double yards = feet * 0.33333;
		System.out.println("The total yards is " + yards + " for the given " + feet + " feets");
	}
	
	static void meters2inches (double meters) {
		double inches = meters * 39.3701;
		System.out.println("The total inches is " + inches + " for the given " + meters + " meters");
	}
	
	static void inches2meters (double inches) {
		double meters = inches * 0.0254;
		System.out.println("The total meters is " + meters + " for the given " + inches + " inches");
	}
	
	static void inches2cm  (double inches) {
		double centimeters = inches * 2.54;
		System.out.println("The total centimeters is " + centimeters + " for the given " + inches + " inches");
	}
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in); 
		
		// taking inputs for various scale parameters
		double yards = input.nextDouble();
		double feets = input.nextDouble();
		double meters = input.nextDouble();
		double inches = input.nextDouble();
		
		// calling functions for changing scales
		yards2feet(yards);
		feet2yards(feets);
		meters2inches(meters);
		inches2meters(inches);
		inches2cm(inches);
	}
}