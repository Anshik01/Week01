import java.util.Scanner;

public class BMICalculator {
	
	static float getBMI(float weight, float height){
		float bodyMassIndex = weight / ((height / 100f) * (height / 100f)); // formula of BMI
		return bodyMassIndex;
	}
	
	static String getWeightStatus(float bodyMassIndex){
		String weightStatus;
		if (bodyMassIndex <= 18.4) {
			weightStatus = "Underweight";
		} else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
			weightStatus = "Normmal";
		} else if (bodyMassIndex >= 25.0 && bodyMassIndex <= 39.9) {
			weightStatus = "Overweight";
		} else {
			weightStatus = "Obese";
		}
		return weightStatus;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a 2D array to store the weight, height and BMI, and taking inputs for them
		// created an array weightStatus to store the status of weights
		float [][] personData = new float [10][3];
		String [] weightStatus = new String [10];
		for (int iterator = 0; iterator < 10; iterator++) {
			personData [iterator][0] = input.nextFloat(); // weight
			personData [iterator][1] = input.nextFloat(); // height in centimeters
			personData [iterator][2] = getBMI(personData[iterator][0], personData[iterator][1]);
			weightStatus[iterator] = getWeightStatus(personData[iterator][2]);
			System.out.println("height: " + personData [iterator][1] + ", weight: " + personData [iterator][0] + ", BMI: " + personData [iterator][2] + ", weight status: " + weightStatus[iterator]);
		}
		
		input.close();
	}
}