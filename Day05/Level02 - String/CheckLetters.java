import java.util.Scanner;

public class CheckLetters{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// input String
		String word = sc.next();
		
		String[][]ans = checkLetter(word);
		
		// printing output in tabular format
		for(int i=0; i<word.length(); i++){
			System.out.println(ans[0][i] + " " + ans[1][i]);
		}
	}
	
	// checking each letter
	public static String[][] checkLetter(String text){
		// converting text to lowercase
		text = text.toLowerCase();
		
		String[][] ans = new String[2][text.length()];
		
		for(int i=0; i<text.length(); i++){
			ans[0][i] = text.charAt(i) + "";
			ans[1][i] = isVowel(text.charAt(i));
		}
		
		return ans;
	}
	
	// usingin conditions to find is character a vowel, consonant or not a number
	public static String isVowel(char ch){
		
		// vowel string to compare character
		String vowel = "aeiou";
		// consonant string to compare character
		String consonant = "bcdfghjklmnpqrstvwxyz";
		
		if(vowel.contains(ch + "")){
			return "Vowel";
		}
		else if(consonant.contains(ch + "")){
			return "Consonant";
		}
		else{
			return "Not a letter";
		}
	}
}