import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
      
        System.out.println("Enter a number ");
        int number = input.nextInt();  // taking number as input
        
        //defining array that store table
        int[] multiplicationTable = new int[10];
        
        // Loop through numbers 1 to 10 
     for (int i = 6; i <= 9; i++) {
            multiplicationTable[i - 6] = number * i;  // Store the multiplication result at the corresponding index
        }
        
        // Display the multiplication table 
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " +              multiplicationTable[i]);
        }


        
        input.close();
    }
}
