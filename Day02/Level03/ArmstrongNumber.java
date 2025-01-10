import java.util.*;

public class ArmstrongNumber{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int  num1= sc.nextInt();
		int num=num1;
		int count=0;
		while(num>0)
		{
		int temp=num%10;
		    count+= Math.pow(temp,3);
			num=num/10;
		
		}
		if(count==num1)
		{System.out.println("It is a Armstrong number");} 
		else {System.out.println("It is not a Armstrong number");}
	}
}