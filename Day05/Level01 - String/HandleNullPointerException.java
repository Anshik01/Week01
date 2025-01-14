public class HandleNullPointerException{
	
	public static void generateNullPointerException(String text){
		// we can't use length method with null string
		System.out.println(text.length());
	}
	
	public static void main(String[]args){
		// creating null string
		String text = null;
		
		try{
			generateNullPointerException(text);
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer exception caught " + e.getMessage());
		}
		
	}
}