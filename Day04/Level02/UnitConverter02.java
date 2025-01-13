import java.util.*;
public class UnitConverter02 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a value : ");
	     double value= sc.nextDouble();

        System.out.println(value + " yards = " + convertYardsToFeet(value) + " feet");
        System.out.println(value + " feet = " + convertFeetToYards(value) + " yards");
        System.out.println(value + " meters = " + convertMetersToInches(value) + " inches");
        System.out.println(value + " inches = " + convertInchesToMeters(value) + " meters");
        System.out.println(value + " inches = " + convertInchesToCm(value) + " centimeters");
    }
}
