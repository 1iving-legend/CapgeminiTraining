import java.util.*;
class SumWhile2{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("start writing: ");
	 
	int count =0;
	while(true)
	{
	   int n1= sc.nextInt();
	   if(n1<=0)
	   {
	     break;
		 
	   }
	   count+=n1;
	  
	}
	 System.out.println("sum is: "+ count);
	
  }
  
  
 


}