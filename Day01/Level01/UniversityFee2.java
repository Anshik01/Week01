import java.util.Scanner;

public class UniversityFee2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		int discountPercent = input.nextInt();
		
		int discount = fee / 10;
		int discountedFee = fee - discount;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}

