import java.util.*;

public class DigitCount{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int  num= sc.nextInt();
		
		int count=0;
		while(num>0)
		{
		int temp=num%10;
		    count++;
			num=num/10;
		
		}
		
		System.out.println("Number of Digits are "+ count);
		
	}
}