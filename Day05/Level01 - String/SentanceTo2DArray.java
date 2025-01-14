import java.util.Scanner;
import java.util.Arrays;

public class  SentanceTo2DArray{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();
		
		String[] wordsInSentance = sentance.split(" ");
		
		String[][] sentance2D = new String[2][wordsInSentance.length];
		
		for(int i=0; i<wordsInSentance.length; i++){
			sentance2D[0][i] =  wordsInSentance[i];
			sentance2D[1][i] = wordsInSentance[i].length() + "";
		}
		
		for(int i=0; i<wordsInSentance.length; i++){
			System.out.println(sentance2D[0][i] + "  " + sentance2D[1][i]);
		}
	}
}