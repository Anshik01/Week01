import java.util.Scanner;

public class ConvertingToLowercase {
	
	public static String convertToLowerCase (String unknownCase) {
		String lowerCaseString = "";
		
		// conversion of unknownCase to lowerCaseString
		for(int i=0; i<unknownCase.length(); i++){
			if((int)unknownCase.charAt(i) < 97){
				lowerCaseString += (char)((int)unknownCase.charAt(i)+32);
			}
			else {
				lowerCaseString += unknownCase.charAt(i);
			}
		}
		
		return lowerCaseString;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		String unknownCase = input.next(); // taking input for a string 
		
		String lowerCaseString = convertToLowerCase(unknownCase); // converting the input string to lowercase by user defined method
		
		String lowerCaseString2 = lowerCaseString.toLowerCase(); // converting the input string to lowercase by inbuilt method
		
		// comparing both strings
		if (lowerCaseString == lowerCaseString2) {
			System.out.println("lowercase string converted through user defined method is " + lowerCaseString + "\nlowercase string converted through inbuilt method is " + lowerCaseString2 + "\nso both strings are same");
		} else {
			System.out.println("lowercase string converted through user defined method is " + lowerCaseString + "\nlowercase string converted through inbuilt method is " + lowerCaseString2 + "\nso both strings are not same");
		}
		
		input.close();
	}
}