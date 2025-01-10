import java.util.*;
class CountdownWhile{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write a number : ");
     int n1= sc.nextInt();
	
	while(n1>=1)
	{
	    System.out.println(n1);
		n1--;
	}
  }

}