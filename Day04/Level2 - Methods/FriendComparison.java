import java.util.Scanner;

public class FriendComparison {
	
	// functions for finding the youngest and the tallest among them
	static int findYoungest(int [] ages) {
		int youngestIndex = 0;
		for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
		return youngestIndex;
	}
	
	static int findTallest(double [] heights) {
		int tallestIndex = 0;
		for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
		return tallestIndex;
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // object of scanner class
	
		// created a final integer variable, FRIEND_COUNT, and three arrays
        final int FRIEND_COUNT = 3;
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[FRIEND_COUNT];
        double[] heights = new double[FRIEND_COUNT];
		
		// iteration to take inputs for ages, and heights arrays
        for (int i = 0; i < FRIEND_COUNT; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                i--; // Decrement index to retry input for the same friend
            }
        }
		
		
		// functions calling
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
		
		// display the output
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
		
		input.close();
    }
}
