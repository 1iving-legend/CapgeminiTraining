import java.util.*;

public class UnitConverter03 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for value and conversion type
        System.out.println("Enter a value: ");
        double value = sc.nextDouble();

        System.out.println("Choose conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");

        int choice = sc.nextInt();

        // Perform conversion based on user's choice
        switch (choice) {
            case 1:
                System.out.println(value + " Fahrenheit = " + convertFahrenheitToCelsius(value) + " Celsius");
                break;
            case 2:
                System.out.println(value + " Celsius = " + convertCelsiusToFahrenheit(value) + " Fahrenheit");
                break;
            case 3:
                System.out.println(value + " pounds = " + convertPoundsToKilograms(value) + " kilograms");
                break;
            case 4:
                System.out.println(value + " kilograms = " + convertKilogramsToPounds(value) + " pounds");
                break;
            case 5:
                System.out.println(value + " gallons = " + convertGallonsToLiters(value) + " liters");
                break;
            case 6:
                System.out.println(value + " liters = " + convertLitersToGallons(value) + " gallons");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }
    }
}
