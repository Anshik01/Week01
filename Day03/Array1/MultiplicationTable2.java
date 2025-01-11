import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] multiplicationResult = new int[4]; // Array for results from 6 to 9

        // Calculate the multiplication table for numbers from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store result in array
        }

        // Display the results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        // Close the scanner
        scanner.close();
    }
}