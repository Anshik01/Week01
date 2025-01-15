import java.util.Scanner;

public class Anagram{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		// input strings
		String s1 = sc.next();
		String s2 = sc.next();
		
		// printing wheather strings are anagram or not
		System.out.println(isAnagram(s1, s2));
	}
	public static boolean isAnagram(String s1, String s2){
		if(s1.length() != s2.length()) {
			return false;
		}
		
		// creating character array to count the frequency
		int[]ch = new int[26];
		
		for(int i=0; i<s1.length(); i++){
			
			// incrament char index
			ch[s1.charAt(i) - 'a'] += 1;
			
			// decreament char index
			ch[s2.charAt(i) - 'a'] -= 1;
			
		}
		
		for(int i=0; i<26; i++){
			if(ch[i] != 0){
				return false;
			}
		}
		return true;
	}
}
