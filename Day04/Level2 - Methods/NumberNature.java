import java.util.Scanner;

public class NumberNature {
	static boolean isEven(int number){
		return number%2==0;
	}
	
	static boolean isNegative(int number){
		return number<0;
	}
	
	static boolean isPositive(int number){
		return number>0;
	}
	
	static void compareFirstandLast(int first, int last) {
		if(first > last){
			System.out.println("First number is greater than the last number.");
		}
		else if(first < last){
			System.out.println("First number is less than the last number.");
		}
		else{
			System.out.println("First number is equal to the last number.");
		}
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // object of scanner class
		
		// created an integer array of size 5 
		int[]numbers = new int[5]; 
		
		// iteration to take input in the array
		for(int i=0; i<5; i++){
			numbers[i] = sc.nextInt();
		}
		
		// iteration through the array to check if the num is even positive, even negative, zero, or negative
		for(int i=0; i<5; i++){
			if(isPositive(numbers[i])){
				if(isEven(numbers[i])){
					System.out.println("The number " + numbers[i] + " is even positive number");
				}
				else{
					System.out.println("The number " + numbers[i] + " is odd positive number");
				}
			} 
			else if(isNegative(numbers[i])){
				System.out.println("The number " + numbers[i] + " is negative.");
			}
			else{
				System.out.println("The number " + numbers[i] + " is zero.");
			}
		}
		
		// calling compare function
		compareFirstandLast(numbers[0], numbers[numbers.length - 1]);
		
		sc.close();
	}
}