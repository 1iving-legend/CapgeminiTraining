import java.util.Scanner;
class Main{

public static void main(String [] args)
{
  Scanner s = new Scanner(System.in);
  double  a = s.nextDouble();
   double b = s.nextDouble();
    double c = s.nextDouble();
	
	double number1=  a + b *c; //number1 contain result of  a + b *c
	double number2=  a * b +c; //number2 contain result of  a * b +c
	double number3=  c+a/b; //number3 contain result of  c + a / b
	double number4=  a % b +c; //number4 contain result of  a % b + c
	
   
   System.out.println(" The results of double Operations are "+number1+", "+number2+", "+number3+ " and "+ number4);

}

}