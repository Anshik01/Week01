import java.util.Scanner;
import java.util.Arrays;

public class CharArrayMethod{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// calling method that converts string into char array using charAt 
		char[] customArray = convertStringToArray(str);
		
		// convert string to char array using inbuilt method
		char[] builtInArray = str.toCharArray();
		
		// check if both are equal
		boolean areEquals = compareArray(customArray, builtInArray);
		
		System.out.println("Custom Array : " + Arrays.toString(customArray));
		System.out.println("Built-in Array : " + Arrays.toString(builtInArray));
		System.out.println("Are both array equal? " + areEquals);
		
	}
	public static char[] convertStringToArray(String str){
		char[] stringArray = new char[str.length()];
		
		for(int i=0; i<str.length(); i++){
			stringArray[i] = str.charAt(i);
		}
		
		return stringArray;
	}
	
	public static boolean compareArray(char[]arr1, char[]arr2){
		if(arr1.length != arr2.length){
			return false;
		}
		
		for(int i=0; i<arr1.length; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
}