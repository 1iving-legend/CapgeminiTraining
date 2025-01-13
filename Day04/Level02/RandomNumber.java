import java.util.Arrays;

public class RandomNumber {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        
        int[] randomNumbers = generator.generate4DigitRandomArray(5);
        
        RandomNumberOperations operations = new RandomNumberOperations();
        double[] result = operations.findAverageMinMax(randomNumbers);
        
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}

class RandomNumberGenerator {
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) +1000;
        }
        return randomNumbers;
    }
}

class RandomNumberOperations {
    public double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        result[0] = sum / (double) numbers.length; // Average
        result[1] = min; // Minimum
        result[2] = max; // Maximum
        
        return result;
    }
}
