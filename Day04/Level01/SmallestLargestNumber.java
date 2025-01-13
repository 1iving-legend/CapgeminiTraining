import java.util.*;
class SmallestLargestNumber{

     public static int[] SmallestLargest(int n1, int n2 ,int n3)
	 {
		 int []ans= new int[2];
		 if(n1<n2 && n1<n3)
	 {
	    ans[1]=n1;
		if(n3>n2)
		{
			ans[0]=n3;
		}
		else{
			ans[0]=n2;
		}
	 }
	 else if(n2<n1 && n2<n3)
	 {
	    ans[1]=n2;
		if(n1>n3)
		{
			ans[0]=n1;
		}
		else{
			ans[0]=n3;
		}
	 }
	 
	 else if(n3<n1 && n3<n2)
	 {
	    ans[1]=n3;
		if(n1>n2)
		{
			ans[0]=n1;
		}
		else{
			ans[0]=n2;
		}
	 }
	    return ans;
	 }
	 
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write three numbers : ");
     int n1= sc.nextInt();
	 int n2= sc.nextInt();
	 int n3= sc.nextInt();
	 
	 int res[]=new int[2];
	
 res= SmallestLargest(n1,  n2 , n3);
 System.out.println("largest number :"+res[0]+"\nsmallest number: "+ res[1]);
  
  }


}