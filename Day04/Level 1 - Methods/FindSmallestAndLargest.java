import java.util.Scanner;

public class FindSmallestAndLargest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		// Taking input
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		// calling check function to check largest and smallest element
		int[]ans = check(number1, number2, number3);
		// print output
		System.out.println("The largest element is " + ans[0] + " and smallest element is " + ans[1]);
	}
	
	public static int[] check(int num1, int num2, int num3){
		
		// Math.max function is used to find the max element between two variable
		int largest = Math.max(num1, Math.max(num2, num3));
		int smallest = Math.min(num1, Math.min(num2, num3));
		
		// return array in output
		return new int[]{largest, smallest};
		
	}
}