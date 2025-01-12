import java.util.Scanner;

public class NumberOfRounds{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		System.out.println(rounds(side1, side2, side3));
	}
	
	// Method to find number of rounds with return type int
	public static int rounds(int side1, int side2, int side3){
		
		int perimeterOfPark = side1 + side2 + side3;
		
		// returning the number of rounds 
		return 5000 / perimeterOfPark;
		
	}
}