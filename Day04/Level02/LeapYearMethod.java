import java.util.*;

public class LeapYearMethod{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int  num= sc.nextInt();
		
		LeapYear object = new LeapYear();
		object.check(num);
		
          
	}
}

public class LeapYear{
	
	
	public void check(int num)
	
	{
		if(num>=1582){
			
			
		if(num%4==0)
		{
		    if(num%100==0)
			{
			  if(num%400==0)
			  {
			    System.out.println("It is a leap year");
			  }
			  else{
			      System.out.println("It is not a leap year");
			  
			  }
			  
			}
			 else{
			      System.out.println("It is a leap year");
			  
			  }
			
		}
	else
	{
			      System.out.println("It is not a leap year");
			  
	   
		}}
		else{
			System.out.println("Enter a valid year");
		}
	}
}