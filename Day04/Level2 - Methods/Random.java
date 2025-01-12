import java.lang.Math;

public class GreatestFactor {
	
	static float[] randomValues() {
		// created four integer variables, and initialized them with random values
		int first = Math.random() % 10;
		int second = Math.random() % 10;
		int third = Math.random() % 10;
		int fourth = Math.random() % 10;
		
		float average = (float)(first + second + third + fourth) / 4f;
		
	}		
	
	public static void main(String[] args){
		float[] randomValues = getRandom();
		
	}
}