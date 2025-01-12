// importing scanner class for taking inputs from user
import java.util.Scanner;

public class UnitConvertor {
	static void kilometerToMiles (double kilometer){
		double miles = kilometer * 0.621371;
		System.out.println("The total miles is " + miles + " mile for the given " + kilometer + " km");
	}
	
	static void milesToKilometers (double miles) {
		double kilometers = miles * 1.60934;
		System.out.println("The total kilometers is " + kilometers + " mile for the given " + miles + " miles");
	}
	
	static void metersToFeet (double meters) {
		double feet = meters * 3.28084;
		System.out.println("The total feet is " + feet + " feet for the given " + meters + " meters");
	}
	
	static void feetToMeters (double feet) {
		double meters = feet * 0.3048;
		System.out.println("The total meters is " + meters + " for the given " + feet + " feet");
	}
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in); 
		
		double kilometer = input.nextDouble();
		double mile = input.nextDouble();
		double meter = input.nextDouble();
		double feet = input.nextDouble();
		
		kilometerToMiles(kilometer);
		milesToKilometers(mile);
		metersToFeet(meter);
		feetToMeters(feet);
	}
}