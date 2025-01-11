import java.util.Scanner;

public class ClassifyNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int[]numbers = new int[5];
		
		for(int i=0; i<5; i++){
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i<5; i++){
			if(numbers[i] > 0){
				if(numbers[i] % 2 == 0){
					System.out.println("The number " + numbers[i] + " is even positive number");
				}
				else{
					System.out.println("The number " + numbers[i] + " is odd positive number");
				}
			} 
			else if(numbers[i] < 0){
				System.out.println("The number " + numbers[i] + " is negative.");
			}
			else{
				System.out.println("The number " + numbers[i] + " is zero.");
			}
		}
		
		if(numbers[0] > numbers[numbers.length - 1]){
			System.out.println("First number is greater than the last number.");
		}
		else if(numbers[0] < numbers[numbers.length - 1]){
			System.out.println("First number is less than the last number.");
		}
		else{
			System.out.println("First number is equal to the last number.");
		}
		
	}
}