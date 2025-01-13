import java.util.Arrays;
import java.util.Scanner;


public class NumberChecker2 {

	 // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
        if (digits[i] != 0) {
            return true;
        }
    }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int number) {
        int count = digits.length;
        int sum = 0;
         for (int i = 0; i < digits.length; i++) {
        sum += Math.pow(digits[i], count);  // Using the normal loop to calculate sum
    }
        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
	    int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} else if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
			int smallest = Integer.MAX_VALUE;
	    	int secondSmallest = Integer.MAX_VALUE;
	    	for (int i = 0; i < digits.length; i++) {  // Normal for loop
			if (digits[i] < smallest) {
				secondSmallest = smallest;
				smallest = digits[i];
			} else if (digits[i] < secondSmallest && digits[i] != smallest) {
				secondSmallest = digits[i];
			}
		}
        return new int[]{smallest, secondSmallest};
	}

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		System.out.println("Enter Number: ");
		int number = input.nextInt(); //taking number as input

        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, number));
        System.out.println("Largest and Second Largest: " + Arrays.toString(findLargestAndSecondLargest(digits)));
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(findSmallestAndSecondSmallest(digits)));
		
		input.close();
    }   
    }