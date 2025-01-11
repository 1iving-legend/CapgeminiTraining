import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Enter a positive integer ");
        int number = input.nextInt(); // taking number as input
        
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }
        
        // Create a String array to store results for each position
        String[] results = new String[number + 1];  // Array size is number + 1 
        
        // Loop through numbers from 1 to the entered number
        for (int i = 0; i <= number; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                results[i] = "Fizz";
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                results[i] = "Buzz";
            }
            // Otherwise, just store the number as a string
            else {
                results[i] = Integer.toString(i);
            }
        }
        
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        input.close();
    }
}
