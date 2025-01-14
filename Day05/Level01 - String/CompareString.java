import java.util.Scanner;

public class CompareString{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		// using inbuilt method to check if strings are equal
		boolean ansUsingEquals = str1.equals(str2);
		
		// using CharAt method to check if strings are equal
		boolean ansUsingCharAt = compareString(str1, str2);
		
		// Comparing both the answer
		System.out.println("Answer got after using .equals method " + ansUsingEquals + " answer got after using .charAt method " + ansUsingCharAt + " Both answers are equal");
	}
	
	// return type of compareString is boolean
	public static boolean compareString(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
}