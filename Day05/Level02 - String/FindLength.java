import java.util.Scanner;

public class FindLength{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// input string
		String str = sc.next();
		
		System.out.println("Length of the given string is : " + findLength(str));
	}
	public static int findLength(String str){
		// initialize length variable
		int len = 0;
		
		// using try-catch block to avoid string out of bound exception
		try{
			// infinite loop
			while(true){
				str.charAt(len);
				len++;     // increament length variable 
			}
		}
		catch(Exception e){
			return len;
		}
		
	}
}