/*
Write an IntOperation program by taking a, b, and c as input
values and print the following integer operations a + b *c,
 a * b + c, c + a / b, and a % b + c. 
 Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-
*/

import java.util.Scanner;
class Main{

public static void main(String [] args)
{
  Scanner sc= new Scanner(System.in);
  int a= sc.nextInt();
   int b= sc.nextInt();
    int c= sc.nextInt();
	
	int number1=  a + b *c; //number1 contain result of  a + b *c
	int number2=  a * b +c; //number1 contain result of  a * b +c
	int number3=  c+a/b; //number1 contain result of  c + a / b
	int number4=  a % b +c; //number1 contain result of  a % b + c
	
   
   System.out.println(" The results of Int Operations are "+number1+", "+number2+", "+number3+ " and "+ number4);

}

}