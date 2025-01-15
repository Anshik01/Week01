import java.util.Scanner;
import java.util.Random;

public class DisplayResult {
	
	// created a method to get random marks for students in various subjects and returning a 2d integer array of marks
	public static int [][] getRandomMarks(int numberOfStudents) {
		// created object of Random class
		Random random = new Random();
		
		// created the array to return 
		int [][] marks = new int [numberOfStudents][3];
		
		// iterating to get the marks randomly
		for (int i=0; i<numberOfStudents; i++) {
			// assigning random values
			marks [i][0] = Math.round(10 + random.nextInt(90)); // since values should be between 10 and 99
			marks [i][1] = Math.round(10 + random.nextInt(90));
			marks [i][2] = Math.round(10 + random.nextInt(90));
		}
		
		return marks; // now marks is containing random two digit numbers
	}
	
	// created a method to get the result by analysing the marks of students
	public static int [][] getResults(int [][] marks){
		// created the array to return 
		int [][] result = new int [marks.length][3];
		
		// iterating through marks array
		for (int i=0; i<marks.length; i++) {
			// assigning random values
			result [i][0] = marks[i][0] + marks[i][1] + marks[i][2]; // calculating total marks
			result [i][1] = ( int)(Math.round((float)((float)result[i][0] * 1.0f / 3.0f))); // calculating average marks 
			result [i][2] = (int)(Math.round(((float)result[i][0] / 300f) * 100f)); // calculating percentage
		}
		
		return result; // now result is containing the total, average and percentage marks 
	}
	
	// created a method to get the grade and remarks by analysing the result of students
	public static String [][] getGradeAndRamarks(int [][] result) {
		// created the array to return 
		String [][] gradeAndRemark = new String [result.length][2];
		
		// iterating through marks 
		for (int i=0; i<result.length; i++) {
			if (result [i][2] <= 39) {
				gradeAndRemark [i][0] = "R";
				gradeAndRemark [i][1] = "Remedial standards";
			} else if (result [i][2] >= 40 && result [i][2] <= 49) {
				gradeAndRemark [i][0] = "E";
				gradeAndRemark [i][1] = "Level 1, too below agency-normalized standards";
			} else if (result [i][2] >= 50 && result [i][2] <= 59) {
				gradeAndRemark [i][0] = "D";
				gradeAndRemark [i][1] = "Level 1, well below agency-normalized standards";
			} else if (result [i][2] >= 60 && result [i][2] <= 69) {
				gradeAndRemark [i][0] = "C";
				gradeAndRemark [i][1] = "Level 2, below, but approaching agency-normalized standards";
			} else if (result [i][2] >= 70 && result [i][2] <= 79) {
				gradeAndRemark [i][0] = "B";
				gradeAndRemark [i][1] = "Level 3, at agency-normalized standards";
			} else {
				gradeAndRemark [i][0] = "A";
				gradeAndRemark [i][1] = "Level 4, above agency-normalized standards";
			}
		}
		
		return gradeAndRemark; // grade and remarks for the students
	}
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, numberOfStudents, to store the number of students, and taking input for that
		int numberOfStudents = input.nextInt();
		
		// getting random marks for all students, and storing that into a 2 dimensional array
		int [][] marks = getRandomMarks(numberOfStudents);
		// marks [student][0] : marks of physics
		// marks [student][1] : marks of chemistry
		// marks [student][2] : marks of maths
		
		// getting result of each student and storing it inside a 2 dimensional array named result
		int [][] result = getResults(marks);
		
		// getting grade and remarks for every student, and storing it into inside a 2 dimensional array named gradeAndRemark
		String [][] gradeAndRemark = getGradeAndRamarks(result);
		
		// printing the results
		for(int i=0; i<result.length; i++){
			System.out.println("marks of student: physics=" + marks[i][0] + ", chemistry=" + marks[i][1] + ", maths=" + marks[i][2]);
			System.out.println("result of student: total marks = " + result [i][0] + ", average marks = " + result[i][1] + ", percentage = " + result[i][2]);
			System.out.println("grade and remark for student: grade = " + gradeAndRemark [i][0] + ", remark = " + gradeAndRemark[i][1]);
			System.out.println();
		}
	}
}