import java.util.*;
class SpringSeason{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write month number: ");
     int n1= sc.nextInt();
	 System.out.println("Write Date: ");
     int n2= sc.nextInt();
	
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
  
  }
  
  
 


