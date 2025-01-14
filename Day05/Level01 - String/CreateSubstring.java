import java.util.Scanner;

public class CreateSubstring{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		String substringUsingInBuilt = str.substring(start,end);
		String substringUsingLoop = createSubstring(str, start, end);
		
		System.out.println("Substring using in-built function " + substringUsingInBuilt + " substring using loop and CharAt is " + substringUsingLoop);
	}
	
	// creating a substring that ranges between start and end
	public static String createSubstring(String str, int start, int end){
		String sub = "";
		for(int i=start; i<end; i++){
			sub = sub + str.charAt(i);
		}
		
		return sub;
	}

}