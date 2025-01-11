import java.util.Scanner;

class PersonBMI2D {
	
	// Method to calculate BMI
    public static double calculateBMIi(double height, double weight) {
        return weight / (height * height);
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Input height
            personData[i][0] = getPositiveInput(sc, "Height (in meters): ");
            
            // Input weight
            personData[i][1] = getPositiveInput(sc, "Weight (in kg): ");

            // Calculate BMI and determine weight status
            personData[i][2] = calculateBMIi(personData[i][0], personData[i][1]);
            weightStatus[i] = determineWeightStatus(personData[i][2]);
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("\nPerson Details (Height, Weight, BMI, Weight Status):");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }

    // Method to calculate BMI
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    // Method to determine weight status based on BMI
    public static String determineWeightStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obese";
    }

    // Method to get positive input with validation
    public static double getPositiveInput(Scanner sc, String prompt) {
        double value;
        do {
            System.out.print(prompt);
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a positive number.");
                System.out.print(prompt);
                sc.next(); // Clear invalid input
            }
            value = sc.nextDouble();
            if (value <= 0) {
                System.out.println("Value must be positive. Please try again.");
            }
        } while (value <= 0);
        return value;
    }
}
