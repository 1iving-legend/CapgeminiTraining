import java.util.*;
class MultiplicationTable{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("write a number: ");
	  int n1= sc.nextInt();
	 
	if(n1>=6 && n1<=9)
	{
	   for(int i=1;i<=10;i++)
	   {
	      System.out.println(n1+" x "+ i+ " = "+n1*i);
	   }
	}
  }
}