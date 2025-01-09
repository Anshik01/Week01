import java.util.Scanner;

public class TemperaturConversion {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double calsius = input.nextDouble();
		
		// Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
		double farenheitResult = (calsius * 9.0/5.0) + 32;
		
		System.out.println("The " + calsius + " celsius is " + farenheitResult + " fahrenheit");
	}
}