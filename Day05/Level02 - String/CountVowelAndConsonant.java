import java.util.Scanner;

public class CountVowelAndConsonant{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		// converting all characters in lowercase because of case sensitivity
		text = text.toLowerCase();
		
		String vowels = "aeiou";
		
		int countVowel = 0;
		int countConsonant = 0;
		for(int i=0; i<text.length(); i++){
			String s = "";
			s += text.charAt(i);
			if(vowels.contains(s)){
				// increment countVowel variable
				countVowel++;
			}
			else{
				// increment countConsonant variable
				countConsonant++;
			}
		}
		
		System.out.println("The given string has " + countVowel + " vowels and " + countConsonant + " consonants");
	}
}