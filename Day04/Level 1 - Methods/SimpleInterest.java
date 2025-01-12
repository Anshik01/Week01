import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		
		// simpleInterest is a method name with void type
		simpleInterest(principle, rate, time);
		
		sc.close();
	}
	
	// Creating a method to find simple interest
	public static void simpleInterest(double principle, double rate, double time){
		// Simple interest = (principle * rate * time) / 100;
		double si = (principle * rate * time) / 100;
		
		System.out.println("The Simple Interest is " + si + " for Principal " + principle + ", Rate of Interest " + rate + " and Time " + time);
	}
}