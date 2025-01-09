// import Scanner class to take the input from user

import java.util.Scanner;

public class KilometersToMiles{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		double kilometerDistance = input.nextDouble();
		
		// 1 mile = 1.6 km
		double mileDistance = kilometerDistance / 1.6;
		
		System.out.println("The total miles is " + mileDistance + " mile for the given " + kilometerDistance + " km");
		
	}
}

