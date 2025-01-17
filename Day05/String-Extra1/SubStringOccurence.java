import java.util.Scanner;

 public class SubStringOccurence{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String subString = sc.next();
		
		System.out.println(count(text, subString));
	}
	
	// Method counts number of occurence
	public static int count(String text, String subString){
		
		// initialize count varibale to 0;
		int count = 0;
		if(text.length() < subString.length()) return count;
		
		// this index will help us to create a window for easy comparision
		int start = 0;
		int end = subString.length();
		
		while(end <= text.length()){
			String sub = text.substring(start,end);
			if(sub.equalsIgnoreCase(subString)){
				count++;
			}
			start++;
			end++;
		}
		
		return count;
	}
 }