import java.util.Scanner;

public class  GeneratingIllegalArgumentException {
	
	public static void generatingRuntimeError(String string){
		String subString = string.substring(string.length()-1, 0); // runtime exception will arise here
		System.out.println(subString);
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		String string = input.next(); 
		
		// generating and handling the exception
		try {
			generatingRuntimeError(string); // extracting the substring from input string
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}