/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/


import java.util.*;

public class Handshakes{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int students= sc.nextInt();
		int result = (students*(students-1))/2;
		
		
		System.out.println("Total number of handshakes are "+ result);
	}
}