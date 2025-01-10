import java.util.*;
class OddEvenFor{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n1= sc.nextInt();
	 

	for(int i=1;i<=n1;i++)
	{
	   if(i%2==0)
	   {
		  System.out.println(i+" : Even"); 
	   }
	   else
	   {
		  System.out.println(i+" : odd"); 
	   }
	}
	 
  }
}