import java.util.*;
class CheckNumber{
  
  public static void positiveNegative(int n1)
  {
	   if(n1==0)
	 {
	       System.out.println("zero");
		
	 }
	 else if(n1<0)
	 {
	       System.out.println("Negative");
		
	 }
	else if(n1>0)
	 {
	       System.out.println("positive");
		
	 }
  }
  
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write a number : ");
     int n1= sc.nextInt();
	
	positiveNegative( n1);
  
  }
  
  
 


}