import java.util.Scanner;

public class BMIStatus {
	
	// method for calculating BMI
	static double getBMI(double weight, double height){
		double bodyMassIndex = weight / ((height / 100f) * (height / 100f)); // formula of BMI
		return bodyMassIndex;
	}
	
	// method for finding the weight status
	static String getWeightStatus(String bmiString){
		String weightStatus; 
		double bodyMassIndex = Double.parseDouble(bmiString); // converting the string value into double value
		
		if (bodyMassIndex <= 18.4) {
			weightStatus = "Underweight";
		} else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
			weightStatus = "Normal";
		} else if (bodyMassIndex >= 25.0 && bodyMassIndex <= 39.9) {
			weightStatus = "Overweight";
		} else {
			weightStatus = "Obese";
		}
		return weightStatus;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a 2D array to store the weight, and height, and taking inputs for them
		// created an array weightStatus to store the status of weights
		double [][] personData = new double [10][2];
		String [][] weightStatus = new String [10][2];
		
		// 10 iterations to get inputs for weight in kilograms, and height in centimeters
		for (int iterator = 0; iterator < 10; iterator++) {
			personData [iterator][0] = input.nextDouble(); // input for weight in kilograms
			personData [iterator][1] = input.nextDouble(); // input for height in centimeters
			
			weightStatus [iterator][0] = getBMI(personData[iterator][0], personData[iterator][1]) + ""; // calculating the BMI and storing into zeroth index of weightStatus array
			weightStatus[iterator][1] = getWeightStatus(weightStatus[iterator][0]); // getting the weight status and storing into first index of weightStatus array
			
			
			System.out.println("height: " + personData [iterator][1] + ", weight: " + personData [iterator][0] + ", BMI: " + weightStatus [iterator][0] + ", weight status: " + weightStatus[iterator][1]);
		}
		
		input.close();
	}
}