import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 1) {
            System.out.println("Greatest factor does not exist for numbers <= 1.");
        } else {
            // Find the greatest factor
            int greatestFactor = 1;
            for (int i = number / 2; i > 0; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            
            // Print the greatest factor
            System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        }
        
        scanner.close();
    }
}
