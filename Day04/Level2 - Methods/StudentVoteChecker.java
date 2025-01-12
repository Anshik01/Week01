import java.util.Scanner;

public class StudentVoteChecker {
	
	// vote eligibility checking function
	static boolean canStudentVote(int age) {
		if(age >= 18){
			return true;
		}
		return false;
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in); // object of scanner class
		
		// student's age will be stored in studentAge array
		int[]studentAge = new int[10];
		
		// iteration to take the input
		for(int i=0; i<10; i++){
			studentAge[i] = sc.nextInt();
			
			if(canStudentVote(studentAge[i])){
				System.out.println("The student with the age " + studentAge[i] + " can vote.");
			}
			else{
				System.out.println("The student with the age " + studentAge[i] + " cannot vote.");
			}
		}
	}
}