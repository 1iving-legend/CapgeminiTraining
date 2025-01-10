/*
Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.*;

public class Main{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		double base= sc.nextDouble();
		double height= sc.nextDouble();
		double areaInCm= (1.0/2.0)*base*height;
		double areaInInches=(1.0/2.0)*base/2.54*height/2.54;
		double areaInfeet=areaInInches/144.0;
		
		
		System.out.println("Your Area in cm square is "+areaInCm+ " while in feet is " +areaInfeet+" and inches is "+areaInInches);
	}
}