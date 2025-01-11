import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        // Initialize an array of 10 elements of type double
        double[] numbers = new double[10];
        
       
        double total = 0.0;
        
        // Index variable to keep track of the current position in the array
        int index = 0;
        
        // Infinite loop to accept user inputs until a stop condition is met
		
		
		 System.out.println("Enter a number (0 or negative to stop) ");
        while (true && index<10) {
         
            double userInput = input.nextDouble();  // taking userInput as input
            
            // Check if the user entered a 0 or a negative number to break the loop
            if (userInput <= 0) {
                break;  // Exit the loop if the input is 0 or negative
            }
            
            // Check if the index has reached the maximum size of the array (10 elements)
            if (index >= 10) {
                System.out.println("Array is full! You can only enter up to 10 numbers.");
                break;  // Exit the loop if the array is full
            }
            
            numbers[index] = userInput;
            index++;
        }
        
      
        for (int i = 0; i < index; i++) {
            total += numbers[i];  // Add each number to the total
        }
        
        // Display the numbers entered by the user
        System.out.println("Numbers entered ");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        
     
        System.out.println("\nTotal sum: " + total);
        
     
        input.close();
    }
}
