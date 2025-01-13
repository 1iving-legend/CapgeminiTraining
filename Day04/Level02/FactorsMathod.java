import java.util.*;



public class FactorsMethod {
    public static void main(String[] args) {
        Factors factors = new Factors();
Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        int[] factorArray = factors.AllFactors(n);

        factors.printArr(factorArray);
        System.out.println("Sum of factors: " + factors.sumOfFactors(factorArray));
        System.out.println("Sum of squares of factors: " + factors.sumOfSquareOfFactors(factorArray));
        System.out.println("Product of factors: " + factors.productOfFactors(factorArray));
    }
}







public class Factors {

    public static int temp = 10;              // Initial size of the array
    public static int[] arr = new int[temp];  // Array to store factors
    public static int index = 0;              // Tracks the number of factors stored

    // Method to find all factors
    public static int[] AllFactors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                addFactor(i); // Add the divisor
                if (i != n / i) { // Add the corresponding pair (if not the same)
                    addFactor(n / i);
                }
            }
        }

        // Resize array to exact size
        int[] result = new int[index];
        System.arraycopy(arr, 0, result, 0, index);
        return result;
    }

    // Helper method to add a factor to the array
    private static void addFactor(int factor) {
        if (index == temp) {
            temp *= 2; // Double the array size
            int[] newArr = new int[temp];
            System.arraycopy(arr, 0, newArr, 0, index);
            arr = newArr;
        }
        arr[index++] = factor;
    }

    // Method to print factors
    public void printArr(int[] arr) {
        System.out.println("Factors are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to calculate the sum of factors
    public int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to calculate the sum of the squares of factors
    public int sumOfSquareOfFactors(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i]; // Use multiplication instead of Math.pow
        }
        return sum;
    }

    // Method to calculate the product of factors
    public long productOfFactors(int[] arr) {
        long product = 1; // Use long to handle larger results
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
}
