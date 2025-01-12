import java.util.Scanner;

public class MaxHandShake2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int numberOfStudent = sc.nextInt();
		
		// handshakes variable has the value retured by the function
		int handshakes = findHandshakes(numberOfStudent);
		
		System.out.println("Total number of handshakes = " + handshakes);
		
		sc.close();
	}
	
	public static int findHandshakes(int numberOfStudent){
		
		// to calculate the function use - (n * (n - 1)) / 2
		
		int handshakes = (numberOfStudent * (numberOfStudent - 1)) / 2;
		
		return handshakes;
	}
}