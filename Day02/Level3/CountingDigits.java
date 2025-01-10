import java.util.Scanner;

public class CountingDigits {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, number, and taking input for that
		int number = input.nextInt();
		
		// created two integer variables, digitCount: count of digits in the number, and numberReplica: replication of the number
		int digitCount = 0, numberReplica = number;
		
		// iteration through each digit of numberReplica using while loop
		while (numberReplica > 0) {
			digitCount++ ; // increasing the value of countDigits
			numberReplica = numberReplica / 10; // removing the unit place digit from numberReplica
		}
		
		// displaying the output 
		System.out.println("there are " + digitCount + " digits in " + number);
	}
}