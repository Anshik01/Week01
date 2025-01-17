import java.util.Scanner;

public class LongestWord{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();
		
		String ans = longestWord(sentance);
		
		System.out.println("Longest word in a sentance is " + ans + " with length " + ans.length());
	}
	
	public static String longestWord(String sentance){
		String[]words = sentance.split(" ");
		
		// idx refers to index of logest string
		int idx = 0;
		int longestLength = 0;
		
		for(int i=0; i<words.length; i++){
			// updating longest string
			if(words[i].length() > longestLength){
				longestLength = words[i].length();
				idx = i;
			}
		}
		
		return words[idx];
	}
}