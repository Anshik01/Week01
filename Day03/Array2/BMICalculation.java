import java.util.Scanner;

public class BMICalculation {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created three arrays to store the weight, height and BMI
		// created an array weightStatus to store the status of weights
		float [] weight = new float [number];
		float [] height = new float [number];
		float [] bodyMassIndex = new float [number];
		String [] weightStatus = new String [number];
		for (int iterator = 0; iterator < number; iterator++) {
			weight [iterator] = input.nextFloat(); // weight
			height [iterator] = input.nextFloat(); // height in centimeters
			bodyMassIndex [iterator] = weight [iterator] / ((height [iterator] / 100f) * (height [iterator] / 100f)); // formula of BMI
			if (bodyMassIndex [iterator] <= 18.4) {
				weightStatus [iterator] = "Underweight";
			} else if (bodyMassIndex [iterator] >= 18.5 && bodyMassIndex [iterator] <= 24.9) {
				weightStatus [iterator] = "Normmal";
			} else if (bodyMassIndex [iterator] >= 25.0 && bodyMassIndex [iterator] <= 39.9) {
				weightStatus [iterator] = "Overweight";
			} else {
				weightStatus [iterator] = "Obese";
			}
			System.out.println("height: " + height [iterator] + ", weight: " + weight [iterator] + ", BMI: " + bodyMassIndex [iterator] + ", weight status: " + weightStatus [iterator]);
		}
		
		input.close();
	}
}