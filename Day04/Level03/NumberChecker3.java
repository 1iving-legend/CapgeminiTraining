import java.util.Scanner;

public class NumberChecker2 {
	//method to count Digit
	 public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

	//method to store digit
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
	//method to calculate sum of digit
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
       for (int i = 0; i < digits.length; i++) { 
		sum += digits[i];
	}
        return sum;
    }
	//method  to calculate sum of square of digit
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
	//method to find harshad number
    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
	// method to print digit frequency
    public static void printDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

		   for (int i = 0; i < digits.length; i++) { 
        frequency[digits[i]][0] = digits[i];
        frequency[digits[i]][1]++;
    }
			for (int i = 0; i < frequency.length; i++) {  
		if (frequency[i][1] > 0) {
			System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
		}
	}
	}
       

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
        int number = input.nextInt(); //taking number as input

        int[] digits = storeDigits(number);

      
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad number: " + isHarshadNumber(digits, number));
        printDigitFrequency(digits);
		
		input.close();
    }
    
}