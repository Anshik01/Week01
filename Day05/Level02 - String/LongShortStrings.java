import java.util.Scanner;

public class  LongShortStrings {
	
	public static int getStringLength(String string){
		// created an integer variable to store the length of the string
		int lengthOfString = 0;
		
		try {
			while (true) {
				string.charAt(lengthOfString++);
			}
		} catch (Exception e) {
			lengthOfString--;
		}
		return lengthOfString;
	}
	
	public static String [] getShortestAndLongestWords(String sentence) {
		String [] longShort = {"abcdefghijklmnopqrstuvwxyz", ""};
		
		// iterating through sentence to extract the words
		String temporary = "";
		for (int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) != ' ' && i != sentence.length()-1) {
				temporary += sentence.charAt(i);
			} else if(i == sentence.length()-1) {
				temporary += sentence.charAt(i);
				if (getStringLength(temporary) <= longShort[0].length()) {
					longShort[0] = temporary;
				} else if (getStringLength(temporary) >= longShort[1].length()) {
					longShort[1] = temporary;
				}
				temporary = "";
			} else {
				if (getStringLength(temporary) <= longShort[0].length()) {
					longShort[0] = temporary;
				} else if (getStringLength(temporary) >= longShort[1].length()) {
					longShort[1] = temporary;
				}
				temporary = "";
			}
		}
		return longShort;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		String sentence = input.nextLine(); // taking a sentence input 		
		
		// getting shortest and longest word in the sentence
		String[] longShort = getShortestAndLongestWords(sentence);
		// longShort[0] = shortest word in the sentence
		// longShort[1] = longest word in the sentence
		
		// printing the output
		System.out.println("shortest word: " + longShort[0] + "\nlongest word: " + longShort[1]);
	}
}