import java.util.Scanner;

public class GeneratingArrayIndexException {
	
	public static void generatingRuntimeError(String[] array){
		System.out.println(array[array.length]); // runtime exception will arise here
	}
	
	public static void handleException() {
		System.out.println("Array index out of bound exception arised.");
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		int numberOfNames = input.nextInt(); 
		
		String [] arrayOfNames = new String [numberOfNames];
		
		// taking inputs for array of names
		for(int i=0; i<numberOfNames; i++){
			arrayOfNames [i] = input.next();
		}
		
		// generating and handling the exception
		try {
			generatingRuntimeError(arrayOfNames);
		} catch (Exception e) {
			handleException();
		}
	}
}