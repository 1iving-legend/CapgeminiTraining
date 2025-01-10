import java.util.*;
class SumForNatural{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n1= sc.nextInt();
	 
	int count =0;
	for(int i=n1;i>=1;i--)
	{
	   count+=i;
	}
	 int sumbyformula= n1*(n1+1)/2;
	 
	 System.out.println("sum using loop is "+count+ " sum using formula is "+ sumbyformula);
	
  }
}