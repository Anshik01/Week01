import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that 
		int number = input.nextInt();
		
		// created a 2D array to store the weight, height and BMI, and taking inputs for them
		// created an array weightStatus to store the status of weights
		float [][] personData = new float [number][3];
		String [] weightStatus = new String [number];
		for (int iterator = 0; iterator < number; iterator++) {
			personData [iterator][0] = input.nextFloat(); // weight
			personData [iterator][1] = input.nextFloat(); // height in centimeters
			personData [iterator][2] = personData [iterator][0] / ((personData [iterator][1] / 100f) * (personData [iterator][1] / 100f)); // formula of BMI
			if (personData [iterator][2] <= 18.4) {
				weightStatus [iterator] = "Underweight";
			} else if (personData [iterator][2] >= 18.5 && personData [iterator][2] <= 24.9) {
				weightStatus [iterator] = "Normmal";
			} else if (personData [iterator][2] >= 25.0 && personData [iterator][2] <= 39.9) {
				weightStatus [iterator] = "Overweight";
			} else {
				weightStatus [iterator] = "Obese";
			}
			System.out.println("height: " + personData [iterator][1] + ", weight: " + personData [iterator][0] + ", BMI: " + personData [iterator][2] + ", weight status: " + weightStatus[iterator]);
		}
		
		input.close();
	}
}