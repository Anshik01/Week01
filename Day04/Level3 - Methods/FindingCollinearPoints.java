//program to find the 3 points that are collinear using the slope formulae and area of triangle formula
import java.util.*;

public class FindingCollinearPoints {
    // Method to find the slope between two points
    public static double calculateSlope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    // Method to check if the three points are collinear using the slope formula
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        // Points are collinear if slopes are equal
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    // Method to check if the three points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        // Points are collinear if area is 0
        return (area == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Check if the points are collinear using the slope formula
        boolean collinearUsingSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        if (collinearUsingSlope) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check if the points are collinear using the area formula
        boolean collinearUsingArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (collinearUsingArea) {
            System.out.println("The points are collinear using the area of the triangle formula.");
        } else {
            System.out.println("The points are not collinear using the area of the triangle formula.");
        }
    }
}
