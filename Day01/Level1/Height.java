/*
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/
import java.util.*;

public class Height{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in CM : ");
		double heightinCM= sc.nextDouble();
		double heightinInches= Math.round((heightinCM/2.54)*100.0)/100.0;
		double heightinFeet= Math.round((heightinInches/12.0)*100.0)/100.0;
		System.out.println("Your Height in cm is "+heightinCM+" while in feet is "+heightinFeet+ " and inches is "+heightinInches);
	}
}