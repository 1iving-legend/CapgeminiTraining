import java.util.*;
class Largestnumber{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write three numbers : ");
     int n1= sc.nextInt();
	 int n2= sc.nextInt();
	 int n3= sc.nextInt();
	 boolean n1c=false, n2c=false, n3c=false;
	 if(n1>n2 && n1>n3)
	 {
	    n1c=true;
		n2c= false;
		n3c=false;
	 }
	 else if(n2>n1 && n2>n3)
	 {
	    n1c=false;
		n2c= true;
		n3c=false;
	 }
	  else if(n3>n1 && n3>n2)
	 {
	    n1c=false;
		n2c= false;
		n3c=true;
	 }
   System.out.println("Is the first number the largest? " + n1c);
   System.out.println("Is the secound number the largest? " + n2c);
   System.out.println("Is the third number the largest? " + n3c);
  
  }
  
  
 


}