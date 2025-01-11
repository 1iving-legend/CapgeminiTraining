import java.util.*;

public class StoringDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Find the number of digits
        int tempNum = num;
        int digitCount = 0;
        while (tempNum > 0) {
            tempNum /= 10;
            digitCount++;
        }

        // Store the digits in an array
        int[] arr = new int[digitCount];
        int index = 0;
        while (num > 0) {
            arr[index] = num % 10; // Extract the last digit
            num /= 10; // Remove the last digit
            index++;
        }

        // Sort the array
        Arrays.sort(arr);

        // Check if the number has at least 2 digits
        if (arr.length >= 2) {
            System.out.println("Largest digit: " + arr[arr.length - 1]);
            System.out.println("Second largest digit: " + arr[arr.length - 2]);
        } else if (arr.length == 1) {
            System.out.println("Largest digit: " + arr[0]);
            System.out.println("Second largest digit: Not available (only one digit in the number)");
        } else {
            System.out.println("No digits to process!");
        }
    }
}
