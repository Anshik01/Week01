import java.util.Scanner;

public class NumberOfRounds{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		int distancePerRound = side1 + side2 + side3;
		
		double totalRounds = 5000.0 / (double)distancePerRound;
		
		System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km");
	}
}