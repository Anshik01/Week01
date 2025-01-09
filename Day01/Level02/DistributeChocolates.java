import java.util.Scanner;

public class DistributeChocolates{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int numberOfChocolate = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		
		int chocolatePerChild = numberOfChocolate / numberOfChildren;
		int remainingChocoloate = numberOfChocolate % numberOfChildren;
		
		System.out.println("The number of chocolates each child gets is " + chocolatePerChild + " and the number of remaining chocolates are " + remainingChocoloate);
	}
}