public class ConvertKmToMile{
	public static void main(String[]args){
	
		double kilometerDistance = 10.8;
		
		// 1 mile = 1.6 * kilometer
		
		double mileDistance = kilometerDistance / 1.6;
		
		System.out.println("The distance " + kilometerDistance + "km in miles is " + mileDistance);
	}
}

