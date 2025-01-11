import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a number to find its factors ");
        int number = input.nextInt();  //taking number as input
        
     
        int maxFactor = 10;  
        int[] factors = new int[maxFactor];  // Array to store factors
        int index = 0;  // Index to store the factors
        
        // Loop through numbers from 1 to the number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  
                // Check if the array has enough space to store the factor
                if (index >= maxFactor) {
                    // If not, double the size of the array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];  // Temporary array with doubled size
                    
                    // Copy the current factors to the temporary array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    
                   
                    factors = temp;
                }
                
                // Store the factor in the array and increment the index
                factors[index] = i;
                index++;
            }
        }
        
        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }
        
      
        input.close();
    }
}
