/*
Rewrite the Sample Program 2 with user inputs
Hint => 
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken 
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___

*/


import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;
        double fromToViaDistance, viaToFinalCityDistance, timeTaken;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter the city you are traveling from: ");
        fromCity = scanner.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        viaCity = scanner.nextLine();

        System.out.print("Enter the city you are traveling to: ");
        toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        fromToViaDistance = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        viaToFinalCityDistance = scanner.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in miles:");
         double timeTakenToViaCity = scanner.nextDouble();
		System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in miles:");
        double  timeTakenTofinalCity = scanner.nextDouble();

        double totalDistance = fromToViaDistance + viaToFinalCityDistance;
	   double totalTimeTaken = timeTakenToViaCity + timeTakenTofinalCity;
	   
	   
	           System.out.print("Total distance traveled is"+totalDistance+" total time taken is "+totalTimeTaken);
	   
        

        scanner.close();
    }
}
