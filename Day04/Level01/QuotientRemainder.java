import java.util.*;
class  QuotientRemainder{

     public static int[] findRemainderAndQuotient(int number, int divisor) 
	 {
		 int []ans= new int[2];
		 ans[0]=number/divisor;
		 ans[1]=number%divisor;
		 
	    return ans;
	 }
	 
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write two numbers : ");
     int n1= sc.nextInt();
	 int n2= sc.nextInt();
	
	 
	 int res[]=new int[2];
	
 res= findRemainderAndQuotient(n1,n2); 
 System.out.println("Quotient is :"+res[0]+"\nRemainder is : "+ res[1]);
  
  }


}