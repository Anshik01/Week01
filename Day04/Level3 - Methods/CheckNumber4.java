import java.util.Scanner;

public class CheckNumber4{
	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		// print output
		System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));
		
	}
	
	// Method to check prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method to check spy number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Method to check automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check buzz number
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
	
}