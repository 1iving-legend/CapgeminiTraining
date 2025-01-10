import java.util.*;
class SaloryBonus{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter salory: ");
	  int n1= sc.nextInt();
	  System.out.println("year of service: ");
	  int n2= sc.nextInt();
	  
	  double bonus= Math.round(((double)n1/20.0)*100.0)/100.0;
	  
	  if(n2>=5)
	  {
	    System.out.println("Bonus amount is "+ bonus);
	  }
	  else {
	     System.out.println("Not eligible for bonus ");
	  }
	 

	 
  }
}