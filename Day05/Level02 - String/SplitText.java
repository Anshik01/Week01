import java.util.Scanner;
import java.util.Arrays;

public class SplitText {
	
	public static String[] returnWords(String text){
		// finding number of words
		int lengthofSentance = numberOfWord(text);
		
		String[]words = new String[lengthofSentance];
		
		// index that track word array
		int i=0;
		
		// creating a temporary string that hold a word
		StringBuilder temp = new StringBuilder();
		for(int j=0; j<text.length(); j++){
			char ch = text.charAt(j);
			if(ch == ' '){
				words[i++] = temp.toString();
				temp.setLength(0);
			} else if(j == text.length()-1) {
				temp.append(ch);
				words[i++] = temp.toString();
				temp.setLength(0);
			} else{
				temp.append(ch);
			}
		}
		return words;
	}
 	
	// Method to find number of words 
	public static int numberOfWord(String text){
		int len = 0;
		
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == ' ' || i==text.length()-1){
				len++;
			}
		}
		
		return len;
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// input string
		String text = sc.nextLine();
		
		String[] ansUsingSplit = text.split(" ");
		String[] ansUsingCharAt = returnWords(text);
		
		System.out.println("Words of the sentence using split method " + Arrays.toString(ansUsingSplit));
		System.out.println("Words of the sentence using CharAt method " + Arrays.toString(ansUsingCharAt));
	}
}