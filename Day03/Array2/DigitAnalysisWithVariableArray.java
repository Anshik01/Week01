import java.util.Scanner;

public class DigitAnalysisWithVariableArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase the size of maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a new temp array with larger size
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy elements to the temp array
                digits = temp; // Assign the temp array back to digits
            }

		digits[index] = (int)number % 10;
            number /= 10;
            index++;
        }

        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
