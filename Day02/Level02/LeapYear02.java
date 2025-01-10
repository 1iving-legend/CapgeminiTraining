import java.util.*;

public class LeapYear{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		double  num= sc.nextInt();
		if(num>=1582 && ((num%4==0 ) || (num%100==0 && num%400==0)))
		{
		  System.out.println("It is a leap year");
		}
		 else{
			      System.out.println("It is not a leap year");
			  
			  }	
		
          
	}
}