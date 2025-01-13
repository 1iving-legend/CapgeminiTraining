import java.util.Scanner;

public class BMICalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight, height, and BMI
        double[][] bmiData = new double[10][3]; // 10 rows and 3 columns

        // Taking input for weight and height of 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter weight in kg: ");
            bmiData[i][0] = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            bmiData[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person and store it in the 3rd column of the array
        BMICalculator.calculateBMI(bmiData);

        // Get BMI status for each person
        String[] status = BMICalculator.getBMIStatus(bmiData);

        // Display the results
        System.out.println("\nDetails of all persons:");
        System.out.println("Person | Weight(kg) | Height(cm) | BMI | Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d       | %.2f       | %.2f       | %.2f | %s\n", 
                (i + 1), bmiData[i][0], bmiData[i][1], bmiData[i][2], status[i]);
        }

        sc.close(); // Close the scanner resource
    }
}

class BMICalculator {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] bmiData) {
        for (int i = 0; i < 10; i++) {
            // Convert height from cm to meters
            double heightInMeters = bmiData[i][1] / 100.0;
            // Calculate BMI
            bmiData[i][2] = bmiData[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status for each person
    public static String[] getBMIStatus(double[][] bmiData) {
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            double bmi = bmiData[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }
}
