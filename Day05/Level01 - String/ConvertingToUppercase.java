import java.util.Scanner;

public class ConvertingToUppercase {
	
	public static String convertToUpperCase (String unknownCase) {
		String UpperCaseString = "";
		
		// conversion of unknownCase to UpperCaseString
		for(int i=0; i<unknownCase.length(); i++){
			if((int)unknownCase.charAt(i) >= 97){
				UpperCaseString += (char)((int)unknownCase.charAt(i)-32);
			}
			else {
				UpperCaseString += unknownCase.charAt(i);
			}
		}
		
		return UpperCaseString;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		String unknownCase = input.next(); // taking input for a string 
		
		String UpperCaseString = convertToUpperCase(unknownCase); // converting the input string to Uppercase by user defined method
		
		String UpperCaseString2 = UpperCaseString.toUpperCase(); // converting the input string to Uppercase by inbuilt method
		
		// comparing both strings
		if (UpperCaseString == UpperCaseString2) {
			System.out.println("Uppercase string converted through user defined method is " + UpperCaseString + "\nUppercase string converted through inbuilt method is " + UpperCaseString2 + "\nso both strings are same");
		} else {
			System.out.println("Uppercase string converted through user defined method is " + UpperCaseString + "\nUppercase string converted through inbuilt method is " + UpperCaseString2 + "\nso both strings are not same");
		}
		
		input.close();
	}
}