import java.util.Scanner;

public class CheckGrade2 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// created a 2D array to store the marks of the student in physics, chemistry, and maths
		int [] marks = new int [3];
		marks[0] = input.nextInt();
		marks[1] = input.nextInt();
		marks[2] = input.nextInt();
		
		// calculating the percentage, and average marks 
		// percentage = gained marks / maximum marks * 100
		float percentage = (float)(marks[0] + marks[1] + marks[2]) / 300f * 100f; // 300 is the maximum marks 
		float averageMarks = (float)(marks[0] + marks[1] + marks[2]) / 3f;
		
		// calculating grade and remarks using if statmement
		String grade, remarks;
		if (percentage <= 39) {
			grade = "R";
			remarks = "Remedial Standards";
		} else if (percentage >= 40 && percentage <= 49) {
			grade = "E";
			remarks = "Level 1, too below agency-normalized standards";
		} else if (percentage >= 50 && percentage <= 59) {
			grade = "D";
			remarks = "Level 1, well below agency-normalized standards";
		} else if (percentage >= 60 && percentage <= 69) {
			grade = "C";
			remarks = "Level 2, below, but approaching agency-normalized standards";
		} else if (percentage >= 70 && percentage <= 79) {
			grade = "B";
			remarks = "Level 3, at agency-normalized standards";
		} else {
			grade = "A";
			remarks = "Level 4, above agency-normalized standards";
		}
		
		// displaying the output
		System.out.println("average marks: " + averageMarks + "\ngrade: " + grade + "\nremarks: " + remarks);
	}
}