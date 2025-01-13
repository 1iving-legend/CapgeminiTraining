import java.util.*;
class  DivideChocolates{

     public static int[] findRemainder(int number, int divisor) 
	 {
		 int []ans= new int[2];
		 ans[0]=number/divisor;
		 ans[1]=number%divisor;
		 
	    return ans;
	 }
	 
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write  numbers of students : ");
     int n1= sc.nextInt();
	 
	  System.out.println("Write  numbers of chocolates : ");
	 int n2= sc.nextInt();
	
	 
	 int res[]=new int[2];
	
 res= findRemainder(n2,n1); 
 System.out.println("Number of chocolates each student will get is :"+res[0]+"\nRemaining chocolates are : "+ res[1]);
  
  }


}