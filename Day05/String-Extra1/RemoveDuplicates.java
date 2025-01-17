import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicates{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// input string
		String text = sc.next();
		
		System.out.println("Text without duplicate is : " + removeDuplicate(text));
	}
	
	// Method is returning the string without duplicates
	public static String removeDuplicate(String text){
		StringBuilder textWithoutDuplicate = new StringBuilder();
		
		for(int i=0; i<text.length(); i++){
			// we do not have contains method in string builder therfore we are converting string builder in string
			if(!textWithoutDuplicate.toString().contains(text.charAt(i) + "")){
				textWithoutDuplicate.append(text.charAt(i));
			}
		}
		
		return textWithoutDuplicate.toString();
	}
}