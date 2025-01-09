import java.util.Scanner;

public class MaxHandshake{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int numberOfStudent = input.nextInt();
		
		// combination = (n * (n - 1)) / 2
		
		int maxHandshake = (numberOfStudent * (numberOfStudent - 1)) / 2;
		
		System.out.println("Maximum number of handshake are " + maxHandshake);
	}
}

