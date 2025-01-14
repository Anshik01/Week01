import java.util.Scanner;

public class GeneratingNumberFormatException {
	
	public static void generatingRuntimeError(String text){
		int number = Integer.parseInt(text); // runtime exception will arise here
	}
	
	public static void handleException() {
		System.out.println("Number Format exception arised.");
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		String text = input.next(); 
		
		// generating and handling the exception
		try {
			generatingRuntimeError(text); // converting the input from string to integer
		} catch (Exception e) {
			handleException();
		}
	}
}