import java.util.Scanner;

public class TemperaturConversion2 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		
		// formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C 
		double calsius = (fahrenheit - 32) * (5.0/9.0);
		
		System.out.println("The " + fahrenheit + " fahrenheit is " + calsius + " calsius");
	}
}