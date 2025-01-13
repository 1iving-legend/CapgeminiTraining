import java.util.*;

public class Handshakes{
	
	public static double noOfHandshakes(double students)
	{
           return (students*(students-1))/2;
	}
	
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		double students= sc.nextInt();
		double result = noOfHandshakes( students);
		
		
		System.out.println("Total number of handshakes are "+ result);
	}
}