//import Arrays class for arrays methods
import java.util.Arrays;

public class CheckNumber2 {

    public static void main(String[] args) {
		// Assuming a number
        int number = 153;

        System.out.println("Number: " + number);
		// Print number of digit
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
		// Print elements of digit
        System.out.println("Digits array: " + Arrays.toString(digits));

		// Print sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));
		
		// Print sum of square of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

		// Print true/false for harshad number condition
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

		//print frequency 
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("Digit Frequencies: ");
        for (int[] freq : digitFrequency) {
            System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
        }
    }

    // Method to find the count of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of digits of a number 
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10]; // Array to store frequencies of digits 0-9

        // Count frequencies
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Create 2D array for result
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;       // Digit
            result[i][1] = frequency[i]; // Frequency
        }

        return result;
    }
}
