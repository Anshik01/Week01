import java.util.Scanner;

public class Quadratic {
	
	public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One repeated root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root is real and repeated:");
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        scanner.close();
    }
}
