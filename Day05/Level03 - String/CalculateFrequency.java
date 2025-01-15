import java.util.Scanner;

public class CalculateFrequency {

    // Method to find the frequency of characters
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequencies = new int[chars.length];

        // Initialize the frequency array with -1 to track unprocessed characters
        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i] = -1;
        }

        // Outer loop to iterate through each character
        for (int i = 0; i < chars.length; i++) {
            if (frequencies[i] == 0) {
                continue; // Skip characters already counted
            }
            frequencies[i] = 1; // Initialize frequency to 1

            // Inner loop to find duplicates
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequencies[i]++;
                    frequencies[j] = 0; // Mark duplicate character as processed
                }
            }
        }

        // Calculate the result array size
        int count = 0;
        for (int freq : frequencies) {
            if (freq > 0) {
                count++;
            }
        }

        // Create a result array to store characters and their frequencies
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (frequencies[i] > 0) {
                result[index++] = chars[i] + " : " + frequencies[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input string
        String text = scanner.nextLine();

        // convert to lowercase
        text = text.toLowerCase();

        // Call the method to find frequencies
        String[] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Frequencies:");
        for (String frequency : frequencies) {
            System.out.println(frequency);
        }

        scanner.close();
    }
}
