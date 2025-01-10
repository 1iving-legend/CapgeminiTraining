/*
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/
import java.util.*;
class Divisibility{
  
  public static void main(String [] args)
  {
	  Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
	 if(n%10==0 || n%10==5)
	 {
	    System.out.println("Number is divisible by 5");
	 }
	 else
	 {
	    System.out.println("Number is not divisible by 5");
	 }
  
  
  }


}