/*
Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

class Main{

public static void main(String [] args)
{
    int radius=6378;
	double volumeKM=(4.0/3.0)*Math.PI*Math.pow(radius,3);
	double volumeMiles= volumeKM*Math.pow(0.621,3);
	System.out.println("The volume of earth in cubic kilometers is "+volumeKM+" and cubic miles is "+volumeMiles);
}

}