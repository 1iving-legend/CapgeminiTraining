import java.util.*;

public class StoringDigit{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		int  num1= sc.nextInt();
		int num=num1;
		int count=0;
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
		Arrays.sort(arr);
		System.out.println("largest digit "+arr[arr.length-1]);
		System.out.println("largest digit "+arr[arr.length-2]);
		
		for(int m=arr.length-1;m>=0;m--)
		{
			System.out.print(" "+arr[m]);
		}
	}
}