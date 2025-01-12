import java.util.Random;

public class PlayerHeight{
	public static void main(String[]args){
		Random random = new Random();
		
		int[]heights = new int[11];
		
		for(int i=0; i<11; i++){
			heights[i] = random.nextInt(101) + 150;
		}
		
		int sum = 0;
		
		// Print height of players 
		System.out.println("Height of all 11 players : ");
		for(int i=0; i<11; i++){
			System.out.print(heights[i] + " ");
			sum += heights[i];
		}
		System.out.println();
		
		double mean = findMean(sum);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
		
		System.out.println("Total sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
	}
	
	// Method to calculate the mean height
    public static double findMean(int sum) {
        return (double) sum / 11;
    }

    // Method to find the shortest height 
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int value : heights) {
            if (value < shortest) {
                shortest = value;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int value : heights) {
            if (value > tallest) {
                tallest = value;
            }
        }
        return tallest;
    }
}