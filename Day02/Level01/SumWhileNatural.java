import java.util.*;
class SumWhileNatural{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n1= sc.nextInt();
	  int num=n1;
	 
	int count =0;
	while(num>0)
	{
	   
	  
	   count+=num;
	   num--;
	  
	}
	 int sumbyformula= n1*(n1+1)/2;
	 
	 System.out.println("sum using loop is "+count+ " sum using formula is "+ sumbyformula);
	
  }
  
  
 


}