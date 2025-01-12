import java.util.Arrays;
import java.util.Scanner;

public class TrigonometricCalculator{
    
    public double[] calculateTrigonometricFunctions(double angle) {
	
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Example angle in degrees
        double angle = sc.nextDouble();

        // Calculate trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Print the results
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}