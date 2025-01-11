import java.util.*;

public class ReverseDigit{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int  num1= sc.nextInt();
		int num=num1;
		int t=2;
		int arr[]= new int[t];
		int i=0;
		while(num>0)
		{
		int temp=num%10;
			num=num/10;
			arr[i]=temp;
			
			i++;
			if(i==t)
			{
			  t*=2;
			  int newarr[]=new int[t];
			  for(int j=0;j<arr.length;j++)
			  {
			    newarr[j]=arr[j];
			  }
			  arr=newarr;
			}
		}
		
		for(int m=0;m<i;m++)
		{
			System.out.print(arr[m]);
			
		}
		
	}
}