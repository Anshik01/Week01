import java.util.Arrays;

public class CheckNumber3 {

    public static void main(String[] args) {
		// initialising a hypothetical number 
        int number = 121;

        System.out.println("Number: " + number);
		
		// print number of digit
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
		
		// print digits of number
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversedDigits = reverseDigitsArray(digits);
		
		// print reverse digit 
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

		// check palindrome
        System.out.println("Is Palindrome: " + isPalindrome(digits));
		
		// check duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }

    // Method to find the number of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digit 
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Start from index 1 to exclude leading zero
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
