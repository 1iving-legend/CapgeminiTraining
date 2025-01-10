import java.util.*;

public class PrimeNumber{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int  num= sc.nextInt();
		
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
		    if(num%i==0)
			{
			  flag=1;
			}
		
		}
		
		if(flag==0)
		{System.out.println("prime");}
	    else
		{ System.out.println(" Not prime");}
		
          
	}
}