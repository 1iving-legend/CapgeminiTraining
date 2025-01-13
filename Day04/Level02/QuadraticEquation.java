import java.util.Scanner;

class  QuadraticEquation{
	
	public static double [] findRoot(double a, double b, double c)
	{
		double res[] =new double[2];
		double delta= (Math.pow(b,2))- (4*a*c);
		
		if(delta<0)
		{
			
		}
		
		else if(delta==0)
		{
			res[0]= -b/(2*a);
		}
		else{
			res[0]= (-b+Math.sqrt(delta))/(2*a);
			res[1]= (-b-Math.sqrt(delta))/(2*a);
		}
		return res;
	}
	

public static void main(String [] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.print("In Equatio ax^2 + bx + c enter value of a: ");
  double a= sc.nextDouble();
  System.out.print("In Equatio ax^2 + bx + c enter value of b: ");
  double b= sc.nextDouble();
  System.out.print("In Equatio ax^2 + bx + c enter value of c: ");
  double c= sc.nextDouble();
  
  double []arr= new double[2];
  arr=findRoot( a, b, c);
   System.out.print("Root of equation are :"+ arr[0]+" "+arr[1]);
  
  
}

}