import java.util.*;
class CanVote{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write age : ");
     int n1= sc.nextInt();
	
	 if(n1>=18)
	 {
	       System.out.println("your age is "+n1+ " and you can vote.");
		
	 }
	 else 
	 {
		 
		    System.out.println("your age is "+n1+ " and you cannot vote.");
		 
		 
	 }
  
  }
  
  
 


}