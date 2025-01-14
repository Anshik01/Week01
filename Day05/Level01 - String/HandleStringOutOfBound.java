public class HandleStringOutOfBound{
	
	public static void generateStringOutOfBound(String text){
		// creating an exception by accessing index value that is outside the range
		System.out.println(text.charAt(text.length()));
	}
	
	public static void main(String[]args){
		
		String text = "name";
		
		// added an exception prone code
		try{
			generateStringOutOfBound(text);
		}
		// catch exception
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception caught : " + e.getMessage());
		}
	}
}