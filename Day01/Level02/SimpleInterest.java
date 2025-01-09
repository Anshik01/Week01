import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int principle = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		
		double simpleInterest = ((double)principle * (double)rate * (double)time) / 100.0;
		
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principle + " ,Rate of Interest " + rate + " and Time " + time);
	}
}