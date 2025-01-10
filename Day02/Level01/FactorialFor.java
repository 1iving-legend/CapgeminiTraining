import java.util.*;
class FactorialFor{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n1= sc.nextInt();
	 
	int count =1;
	for(int i=n1;i>=1;i--)
	{
	   count*=i;
	}
	 
	 System.out.println("Factorial using for loop is "+ count);
	
  }
}