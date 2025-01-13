import java.util.*;

public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a value : ");
	     double value= sc.nextDouble();
        

        System.out.println(value + " kilometers = " + convertKmToMiles(value) + " miles");
        System.out.println(value + " miles = " + convertMilesToKm(value) + " kilometers");
        System.out.println(value + " meters = " + convertMetersToFeet(value) + " feet");
        System.out.println(value + " feet = " + convertFeetToMeters(value) + " meters");
    }
}
