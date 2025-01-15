import java.util.Scanner;

public class RemoveSpaces{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// input string with whitespace
		String text = sc.next();
		
		// finding index of substring
		int[]idx = findingIndex(text);
		
		// checking both strings
		boolean isEqual = checkingResults(text, idx);
		
		System.out.println("Is both string equal : " + isEqual);
	}
	
	// finding index after triming the string
	public static int[] findingIndex(String text){
		
		// calculating start index
		int start = 0;
		while(start < text.length() && text.charAt(start) == ' '){
			start++;
		}
		
		// calculating end index
		int end = text.length() - 1;
		while(end >= 0 && text.charAt(end) == ' '){
			end--;
		}
		
		// return index of substring that does not include backspace
		return new int[]{start, end+1};
	}
	
	public static boolean checkingResults(String text, int[]idx){
		String trimText = text.trim();
		String subStringText = text.substring(idx[0], idx[1]);
		
		System.out.println("String after using trim() method : " + trimText + " string using manual method is : " + subStringText);
		
		if(trimText.length() != subStringText.length()) return false;
		
		for(int i=0; i<trimText.length(); i++){
			if(trimText.charAt(i) != subStringText.charAt(i)){
				return false;
			}
		}
		return true;
	}
}