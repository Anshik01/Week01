import java.util.Scanner;

public class ReverseString{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		System.out.println("Reverse string is " + reverse(text));
	}
	
	// Method to reverse a string 
	public static String reverse(String text){
		String reverseString = "";
		
		for(int i=0; i<text.length(); i++){
			reverseString = text.charAt(i) + reverseString;
		}
		
		return reverseString;
	}
}