import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int FRIEND_COUNT = 3;
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[FRIEND_COUNT];
        double[] heights = new double[FRIEND_COUNT];

        System.out.println("Enter the age and height for each friend:");

        for (int i = 0; i < FRIEND_COUNT; i++) {
            System.out.print(friends[i] + " age: ");
            ages[i] = scanner.nextInt();

            System.out.print(friends[i] + " height: ");
            heights[i] = scanner.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to retry input for the same friend
            }
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < FRIEND_COUNT; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        scanner.close();
    }
}
