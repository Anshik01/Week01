import java.util.Scanner;

public class Palindrome{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		System.out.println("is the given string palindrome? " + isPalindrome(text));
	}
	
	// method to check palindrome
	public static boolean isPalindrome(String str){
		
		// initialise index
		int i = 0;
		int j = str.length()-1;
		
		while(i <= j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}