import java.util.*;

public class DigitFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Array to store the frequency of digits (0-9)
        int[] freq = new int[10];

        // Calculate frequency of each digit
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            freq[digit]++;        // Increment the frequency of the digit
            num /= 10;            // Remove the last digit
        }

        // Print the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " : " + freq[i]);
            }
        }
    }
}
