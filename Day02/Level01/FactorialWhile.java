import java.util.*;
class FactorialWhile{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n1= sc.nextInt();
	  int num=n1;
	 
	int count =1;
	while(num>0)
	{
	   count*=num;
	   num--;
	  
	}
	 
	 System.out.println("Factorial using while loop is "+ count);
	
  }
  
  
 


}