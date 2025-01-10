import java.util.*;
class Smallestnumber{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write three numbers : ");
     int n1= sc.nextInt();
	 int n2= sc.nextInt();
	 int n3= sc.nextInt();
	 if(n1<n2 && n1<n3)
	 {
	    System.out.println("Number1 is smallest");
	 }
	 else
	 {
	    System.out.println("Number1 is not smallest");
	 }
  
  
  }


}