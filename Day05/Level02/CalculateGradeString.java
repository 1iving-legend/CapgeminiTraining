import java.lang.Math;
import java.util.*;
public class StudentGradesString {
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter number of students : ");
		int n = input.nextInt();
		
		
		int marks[][] = generateMarks(n);
		
		
		int[] percentages = calculatePercentages(marks);

		
		int[] total = calculateTotal(marks);
		
		
		char[] grades = calculateGrades(percentages);
		
		
		System.out.println("Total number of students is " + n);
		System.out.println("Student physics chemistry maths total percentage grade");
		System.out.println("-------------------------------------------------------");
		for(int i=0; i<n; i++) {
			System.out.println(i+1 + "       " + marks[i][0] + "      " + marks[i][1] + "        " + marks[i][2] + "    " + total[i] + "   " + percentages[i] + "         " + grades[i]);
		}
		
		input.close();
		
	}
	//method to generate random marks
	public static int[][] generateMarks(int n) {
		
		
		int marks[][] = new int[n][3];
		
		
		for(int i=0; i < n; i++){
			//generating random ages
			marks[i][0] = (int)(Math.random()*90) + 10;
			marks[i][1] = (int)(Math.random()*90) + 10;
			marks[i][2] = (int)(Math.random()*90) + 10;

		}

		return marks;		
	}
	
	public static int[] calculateTotal(int marks[][]) {
		
		//creating array to store total marks of students
		int[] total = new int[marks.length];
		
		
		for(int i=0; i<marks.length; i++) {
			total[i] = Math.round(marks[i][0] + marks[i][1] + marks[i][2]);
		}
		
		return total;
	}
	
	public static int[] calculatePercentages(int[][] marks) {
		
		
		
		int[] percentages = new int[marks.length];
		
	
		for(int i=0; i<marks.length; i++) {
			percentages[i] = Math.round((marks[i][0] + marks[i][1] + marks[i][2])/3);
		}
		
		return percentages;
	}
	
	//method to calculate grades of students
	public static char[] calculateGrades(int[] percentages) {
		
		
		char[] grades = new char[percentages.length];
		
		for(int i=0; i<percentages.length; i++) {
			if(percentages[i] >= 80) {
				grades[i] = 'A';
			} else if(percentages[i] >=70) {
				grades[i] = 'B';
			} else if(percentages[i] >=60) {
				grades[i] = 'C';
			} else if(percentages[i] >=50) {
				grades[i] = 'D';
			} else if(percentages[i] >=40) {
				grades[i] = 'E';
			} else {
				grades[i] = 'R';
			}
		}
		
		return grades;
	}
}
				