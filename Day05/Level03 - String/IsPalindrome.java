import java.util.Scanner;

public class IsPalindrome {

    // Logic 1: Compare characters from start and end using loops
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Compare characters from start and end recursively
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed arrays
    public static boolean isPalindromeWithCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseCharArray(originalArray);
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse array
    private static char[] reverseCharArray(char[] array) {
        char[] reversedArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
        String text = sc.next(); // You can change this text to test other cases

        // convert text to lowercase
        text = text.toLowerCase();
		
        // Logic 1: Iterative approach
        boolean result1 = isPalindromeIterative(text);
        System.out.println("Using Iterative Method: " + (result1 ? "Palindrome" : "Not a Palindrome"));

        // Logic 2: Recursive approach
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Using Recursive Method: " + (result2 ? "Palindrome" : "Not a Palindrome"));

        // Logic 3: Using character arrays
        boolean result3 = isPalindromeWithCharArray(text);
        System.out.println("Using Character Array Method: " + (result3 ? "Palindrome" : "Not a Palindrome"));
    }
}
