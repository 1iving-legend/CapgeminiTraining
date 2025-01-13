import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store the 5 numbers
        int[] numbers = new int[5];

        // Taking user input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Loop through the array and check whether the number is positive, negative, even or odd
        for (int i = 0; i < 5; i++) {
            // Check if number is positive or negative
            if (NumberUtils.isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");
                // Check if positive number is even or odd
                if (NumberUtils.isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Compare the first and last number of the array
        int comparisonResult = NumberUtils.compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First number is equal to last number.");
        } else {
            System.out.println("First number is less than last number.");
        }

        sc.close(); 
    }
}

class NumberUtils {
    // Method to check if the number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check if the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}
