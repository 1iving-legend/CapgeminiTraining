/*
Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/


import java.util.*;

public class DistanceInYard{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		double distanceInFeet= sc.nextDouble();
		double distanceInyard=distanceInFeet/3;
		double distanceInmile=distanceInyard/1760;
		System.out.println("Your Distance in feet is " +distanceInFeet+ " while in yard is "+ distanceInyard+ " and miles is "+ distanceInmile);
	}
}