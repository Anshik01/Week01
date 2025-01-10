import java.util.Scanner;

public class FriendsHeights {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created three integer variables, amarAge, akbarAge, and anthonyAge, and taking input for them
		int amarAge = input.nextInt();
		int akbarAge = input.nextInt();
		int anthonyAge = input.nextInt();
		
		// created three double variables, amarHeight, akbarHeight, and anthonyHeight, and taking input for them
		double amarHeight = input.nextDouble();
		double akbarHeight = input.nextDouble();
		double anthonyHeight = input.nextDouble();
		
		// finding the youngest among them 
		int youngest;
		String youngestPerson;
		if (amarAge < akbarAge && amarAge < anthonyAge){
			youngest = amarAge;
			youngestPerson = "Amar";
		} else if (amarAge > akbarAge && akbarAge < anthonyAge) {
			youngest = akbarAge;
			youngestPerson = "Akbar";
		} else {
			youngest = anthonyAge;
			youngestPerson = "Anthony";
		}
		
		// finding the tallest among them 
		double tallest;
		String tallestPerson;
		if (amarHeight > akbarHeight && amarHeight > anthonyHeight){
			tallest = amarHeight;
			tallestPerson = "Amar";
		} else if (amarHeight < akbarHeight && akbarHeight > anthonyHeight) {
			tallest = akbarHeight;
			tallestPerson = "Akbar";
		} else {
			tallest = anthonyHeight;
			tallestPerson = "Anthony";
		}
		
		//displaying the outputs
		System.out.println("youngest among them is " + youngestPerson + " and the tallest among them is " + tallestPerson);
	}
}