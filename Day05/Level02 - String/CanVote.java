import java.util.Scanner;

public class CanVote {
	// created a method to check the voting eligibility of students
	public static String [][] getVotingEligibilityResult(int [] age){
		// created the array to return
		String[][] votingEligibilityResult = new String [age.length][2];
		
		// iterating through age array to get the output
		for(int i=0; i< age.length; i++){
			votingEligibilityResult[i][0] = age[i] + "";
			if(age[i]<0){
				votingEligibilityResult[i][1] = "Invalid age";
			} else {
				if(age[i]<18){
					votingEligibilityResult[i][1] = "Student is not eligibile to vote";
				} else {
					votingEligibilityResult[i][1] = "Student is eligibile to vote";
				}
			}
		}
		
		return votingEligibilityResult;
	}
	
	// created method checkEligibility to check and print if students can vote or not
	public static void checkEligibility(int[] age)
	{
		// created a 2d string array for storing the output
		String [][] votingEligibilityResult = getVotingEligibilityResult(age);
		
		// printing the result
		for(int i=0; i<votingEligibilityResult.length; i++){
			System.out.println(votingEligibilityResult[i][0] + " " + votingEligibilityResult[i][1]);
		}
	}
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an array of integers to store the age of students
		int[] age = new int [10];
		
		// iterating to get input for age array 
		for(int i=0; i<10; i++){
			age[i] = input.nextInt();
		}
		
		// calling the checkEligibility() method to print the output
		checkEligibility(age);
	}
}