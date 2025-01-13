import java.util.*;
class SumForNatural{
  
  public static int sumOfN(int n)
  {
	  int count =0;
	for(int i=n;i>=1;i--)
	{
	   count+=i;
	}
	return count;
	  
  }
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n= sc.nextInt();
	 
	int count=sumOfN( n);
	 
	 System.out.println("sum using loop is "+count);
	
  }
}