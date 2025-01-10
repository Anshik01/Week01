import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created two double variables, weightInKilograms, and heightInCentimeters, and taking input for them
		double weightInKilograms = input.nextDouble();
		double heightInCentimeters = input.nextDouble();
		
		// calculation of body mass index
		// converting height in centimeters to height in meters because of BMI formula
		// BMI = weight(in kg) / (height * height)(in meters)
		double heightInMeters = (heightInCentimeters / 100); // since 1 meter = 100 centimeters
		double bodyMassIndexValue = weightInKilograms / (heightInMeters * heightInMeters);
		
		// created a string variable to store the weight status 
		String weightStatus;
		if (bodyMassIndexValue <= 18.4) {
			weightStatus = "Underweight";
		} else if (bodyMassIndexValue >= 18.5 && bodyMassIndexValue <= 24.9) {
			weightStatus = "Normmal";
		} else if (bodyMassIndexValue >= 25.0 && bodyMassIndexValue <= 39.9) {
			weightStatus = "Overweight";
		} else {
			weightStatus = "Obese";
		}
		
		// displaying the output
		System.out.println("Weight status of the person: " + weightStatus);
	}
}