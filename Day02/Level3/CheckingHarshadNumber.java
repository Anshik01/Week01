import java.util.Scanner;

public class CheckingHarshadNumber {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// created two integer variables, sum: to store sum of digits of number, and numberReplica: replication of number
		int sum = 0, numberReplica = number;
		
		// iteration through each digit of numberReplica using while loop
		while (numberReplica > 0) {
			int unitDigit = numberReplica % 10; // digit at unit place of numberReplica
			sum = sum + unitDigit; // adding cube of digit to sum 
			numberReplica = numberReplica / 10; // removal of the digit at unit place from numberReplica
		}
		
		// displaying the output 
		if (number % sum == 0) {
			System.out.println(number + " is a Harshad number");
		} else {
			System.out.println(number + " is not a Harshad number");
		}
	}
}