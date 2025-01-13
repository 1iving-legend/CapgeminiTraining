import java.util.*;
class SumOfNatural{

public static int sumRecursion(int n)
{
   
   if(n==1)
   {
    return 1;
   }
   
   return n+sumRecursion(n-1);

}
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n1= sc.nextInt();
	 
	 int sumbyformula= n1*(n1+1)/2;
	 
	 System.out.println("sum using Recursion is "+sumRecursion(n1)+ " \nsum using formula is "+ sumbyformula);
	
  }
}