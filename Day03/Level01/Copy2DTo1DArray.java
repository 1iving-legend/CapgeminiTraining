import java.util.Scanner;

public class Copy2DTo1DArray {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Prompt user for the number of rows and columns for the 2D array
        System.out.println("Enter the number of rows ");
        int rows = input.nextInt(); // taking rows as input
        System.out.println("Enter the number of columns ");
        int columns = input.nextInt(); // taking columns as input

        // Create a 2D array (matrix) of size rows x columns
        int[][] matrix = new int[rows][columns];

        // Take user input to fill the 2D array
        System.out.println("Enter the elements of the matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt(); //taking element of matrix
            }
        }

        // Create a 1D array with size equal to rows * columns
        int[] array = new int[rows * columns];
        int index = 0;  // Initialize index for the 1D array

      
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];  // Copy the element to the 1D array
                index++;  
            }
        }

        // Display the 1D array after copying
        System.out.println("The elements in the 1D array are ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
