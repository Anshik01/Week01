// importing Math class for calculation

import java.lang.Math;

public class VolumeOfEarth{
	public static void main(String[]args){
		
		int kilometerRadius = 6378;
		double mileRadius = (double)kilometerRadius / 1.6;
		
		// Volume of a Sphere is (4/3) * pi * r^3
		
		double volumeInKilometer = (4.0/3.0) * Math.PI * Math.pow(kilometerRadius, 3);
		double volumeInMiles = (4.0/3.0) * Math.PI * Math.pow(mileRadius, 3);
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometer + " and cubic miles is " + volumeInMiles);
	}
}

