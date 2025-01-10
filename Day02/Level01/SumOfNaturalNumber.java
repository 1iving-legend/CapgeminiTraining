import java.util.*;
class SumOfNaturalNumber{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write a number : ");
     int n1= sc.nextInt();
	
	 if(n1>0)
	 {
		 int sum= n1*(n1+1)/2;
	       System.out.println("It is a natural number and sum of "+n1+ " natural number is "+ sum);
		
	 }
	 else 
	 {
		 
		  System.out.println("It is not a natural number. ");
		 
		 
	 }
  
  }
  
  
 


}