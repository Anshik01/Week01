import java.util.Scanner;

public class FindSide{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int perimeter = input.nextInt();
		
		// perimeter of square = 4 * side
		int side = perimeter / 4;
		
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		
	}
}

