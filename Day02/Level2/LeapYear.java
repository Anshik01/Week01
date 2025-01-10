import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created an integer variable, year, and taking input for that
		int year = input.nextInt();
		
		// checking if entered year is a leap year or not 
		if (year < 1582) {
			System.out.println("The LeapYear program only works for year >= 1582"); // as given in the problem statement
		} else if (year % 4 == 0) { // if year is divisible by 4
			if (year % 100 == 0) { // if year is divisible by 100
				if (year % 400 == 0) { // if year is divisible by 100 then it needs to be divisible by 400
					System.out.println("year " + year + "is a leap year");
				} else { // if it is divisible by 100 but not 400, then it is not a leap year
					System.out.println("year " + year + "is not a leap year");
				}
			}
			else { // if the year is divisible by 4 but not by 100, then no need to check further, it is definitely a leap year
				System.out.println("year " + year + "is a leap year");
			}
		} else { // if the number is not divisible by 4, then it is not a leap year
			System.out.println("year " + year + "is not a leap year");
		}
		input.close();
	}
}