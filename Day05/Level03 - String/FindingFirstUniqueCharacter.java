import java.util.Scanner;

public class FindingFirstUniqueCharacter {

    // method to find the first unique/non-repeating  character in a string
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256]; // array to store frequency of each character (ASCII size)
        
        // iterating through the text to calculate frequencies
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // iterating through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // returning null character if no unique/non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // object of scanner class

        // taking a string input
        String input = scanner.nextLine();

        // created a character variable to store the first non-repeating character in the input string
        char result = findFirstNonRepeating(input);

        // displaying the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        scanner.close(); // closing the scanner object
    }
}
