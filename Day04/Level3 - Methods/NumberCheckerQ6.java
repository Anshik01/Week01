import java.util.*;

public class NumberCheckerQ6 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to find the factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors 
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static double findProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Subtracting the number itself
        return sum == number;
    }

    // Method to check abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Subtracting the number itself
        return sum > number;
    }

    // Method to check deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Subtracting the number itself
        return sum < number;
    }

    // Method to check a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Method to calculate factorial of a number
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Finding the factors
        int[] factors = findFactors(number);

        // Displaying factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Finding the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Finding the sum of the factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        // Finding the product of the factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        // Finding the product of the cubes of the factors
        double productOfCubes = findProductOfCubesOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        // Checking if the number is perfect
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        // Checking if the number is abundant
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Checking if the number is deficient
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient Number.");
        } else {
            System.out.println(number + " is not a Deficient Number.");
        }

        // Checking if the number is strong
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
    }
}