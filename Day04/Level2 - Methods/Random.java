import java.lang.Math;

public class Random {
	
	static float[] randomValues() {
		// created four integer variables, and initialized them with random values
		int first = (int)(Math.random() * 9) + 1;
		int second = (int)(Math.random() * 9) + 1;
		int third = (int)(Math.random() * 9) + 1;
		int fourth = (int)(Math.random() * 9) + 1;
		
		float averageRandom = (float)(first + second + third + fourth) / 4f;
		float minimumRandom = Math.min(Math.min(first, second), Math.min(third, fourth));
		float maximumRandom = Math.max(Math.max(first, second), Math.max(third, fourth));
		
		float[] randomValues = {averageRandom, minimumRandom, maximumRandom};
		return randomValues;
	}		
	
	public static void main(String[] args){
		float[] randomValues = randomValues();
		
		// printing the output
		System.out.println("Random values average: " + randomValues[0]);
		System.out.println("Random values minimum: " + (int)randomValues[1]);
		System.out.println("Random values maximum: " + (int)randomValues[2]);
	}
}