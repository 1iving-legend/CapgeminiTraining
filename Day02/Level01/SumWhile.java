import java.util.*;
class SumWhile{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("start writing: ");
	 boolean flag=true;
	int count =0;
	while(flag)
	{
	   int n1= sc.nextInt();
	   count+=n1;
	   if(n1==0)
	   {
	     flag=false;
		 
	   }
	}
	 System.out.println("sum is: "+ count);
	
  }
  
  
 


}