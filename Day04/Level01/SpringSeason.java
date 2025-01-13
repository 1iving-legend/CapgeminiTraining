
import java.util.*;
class SpringSeason{
	
	 public static void checkSpring(int n1, int n2)
	 {
		if(n1>=3 && n1<=6)
	 {
	     if(n1==3)
		 {
		     if(n2<20)
			 {
			  System.out.println("Not a Spring Season");
			 }
			 else{
			 System.out.println(" It's Spring Season");
			 }
		 }
		 
		 
		else if(n1==6)
		 {
		     if(n2>20)
			 {
			  System.out.println("Not a Spring Season");
			 }
			 else{
			 System.out.println(" It's Spring Season");
			 }
		 }
		 else{
			 System.out.println(" It's Spring Season");
			 }
		 
		 
		
	 }
	 else
	 {
	       System.out.println("Not a Spring Season");
		
	 } 
		 
	 }
	
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
     int n1= Integer.parseInt(args[0]);
	int n2= Integer.parseInt(args[1]);
	checkSpring( n1, n2);
	
	 }
  
  }
  
  
 
