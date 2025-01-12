// importing scanner class for taking inputs from user
import java.util.Scanner;

public class UnitConvertor3 {
	
	// various scale changing functions
	static void farhenheitToCelsius (double farhenheit){
		double celsius = (farhenheit - 32) * 5.0 / 9.0; 
		System.out.println("The total celsius is " + celsius + " for the given " + farhenheit + " farhenheit");
	}
	
	static void celsiusToFarhenheit (double celsius) {
		double farhenheit = (celsius * 9.0 / 5.0) + 32;
		System.out.println("The total farhenheit is " + farhenheit + " for the given " + celsius + " celsius");
	}
	
	static void poundsToKilograms (double pounds) {
		double kilograms = pounds * 0.453592;
		System.out.println("The total kilograms is " + kilograms + " for the given " + pounds + " pounds");
	}
	
	static void kilogramsToPounds (double kilograms) {
		double pounds = kilograms * 2.20462;
		System.out.println("The total pounds is " + pounds + " for the given " + kilograms + " kilograms");
	}
	
	static void gallonsToLiters (double gallons) {
		double liters = gallons * 3.78541;
		System.out.println("The total liters is " + liters + " for the given " + gallons + " gallons");
	}
	
	static void litersToGallons (double liters) {
		double gallons = liters * 0.264172;
		System.out.println("The total gallons is " + gallons + " for the given " + liters + " liters");
	}
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in); 
		
		// taking inputs for various scale parameters
		double farhenheit = input.nextDouble();
		double celsius = input.nextDouble();
		double pounds = input.nextDouble();
		double kilograms = input.nextDouble();
		double gallons = input.nextDouble();
		double liters = input.nextDouble();
		
		// calling functions for changing scales
		farhenheitToCelsius(farhenheit);
		celsiusToFarhenheit(celsius);
		poundsToKilograms(pounds);
		kilogramsToPounds(kilograms);
		gallonsToLiters(gallons);
		litersToGallons(liters);
	}
}