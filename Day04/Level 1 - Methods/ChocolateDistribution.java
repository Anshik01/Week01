import java.util.Scanner;

public class ChocolateDistribution{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int numberOfChocolate = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		
		// calling function 
		int[]ans = distribute(numberOfChocolate, numberOfChildren);
		
		//print answer
		System.out.println("Number of chocolate each child gets is " + ans[1] + " number of chocolate remaining is " + ans[0]);
	}
	
	public static int[] distribute(int numberOfChocolate, int numberOfChildren){
		
		// finding remaining chocolate and chocolate per child
		int reminingChocolate = numberOfChocolate % numberOfChildren;
		int chocolatePerChild = numberOfChocolate / numberOfChildren;
		
		return new int[]{reminingChocolate, chocolatePerChild};
	}

}