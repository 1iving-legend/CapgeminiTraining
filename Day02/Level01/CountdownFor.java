import java.util.*;
class CountdownFor{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write a number : ");
     int n1= sc.nextInt();
	
	 for(int i=n1;i>=1;i--)
	{
	    System.out.println(i);
	}
  }
}