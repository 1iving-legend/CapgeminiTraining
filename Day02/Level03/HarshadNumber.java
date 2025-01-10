import java.util.*;

public class HarshadNumber{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int  num1= sc.nextInt();
		int num=num1;
		int count=0;
		int temp=0;
		while(num>0)
		{
		 temp=num%10;
		    count+= temp;
			num=num/10;
		
		}

		if(num1%count==0)
		{System.out.println("It is a Harshad number");} 
		else {System.out.println("It is not a Harshad number");}
	}
}