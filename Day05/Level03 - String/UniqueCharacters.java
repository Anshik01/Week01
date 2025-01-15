import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int findLength(String text) {
		
		// created an integer variable, length to store the length of the array
        int length = 0;
        try {
            while (text.charAt(length) != '\0') { // after all the characters of the string will be iterated, it will throw index of bound error
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }
        return length;
    }

    // Method to find unique characters in a string using charAt() and return them as a 1D array
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] result = new char[length];
        int resultIndex = 0;
		
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < resultIndex; j++) {
                if (result[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[resultIndex] = currentChar;
                resultIndex++;
            }
        }

        // Create a new array to store only unique characters
        char[] uniqueCharacters = new char[resultIndex];
        for (int i = 0; i < resultIndex; i++) {
            uniqueCharacters[i] = result[i];
        }

        return uniqueCharacters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input of a string 
        String input = scanner.nextLine();

        // Finding and displaying unique characters
        char[] uniqueCharacters = findUniqueCharacters(input);
        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        scanner.close(); // closing the scanner object
    }
}
