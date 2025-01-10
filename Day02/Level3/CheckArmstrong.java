import java.util.Scanner;

public class CheckArmstrong {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// created two integer variables, sum: to store sum of the cubes of digits, and numberReplica: replication of number
		int sum = 0, numberReplica = number;
		
		// iteration through each digit of numberReplica using while loop
		while (numberReplica > 0) {
			int unitDigit = numberReplica % 10; // digit at unit place of numberReplica
			sum = sum + ( unitDigit * unitDigit * unitDigit ); // adding cube of digit to sum 
			numberReplica = numberReplica / 10; // removal of the digit at unit place from numberReplica
		}
		
		// displaying the output 
		if (sum == number) {
			System.out.println(number + " is an armstrong number");
		} else {
			System.out.println(number + " is not an armstrong number");
		}
	}
}