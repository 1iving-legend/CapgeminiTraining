import java.util.*;

public class FootballTeam {

    //  method to generate random heights
    public  int[] generateRandomHeights(int size, int min, int max) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }

    //  method to calculate the sum of all heights
    public  int calculateSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    //  method to calculate the mean height
    public double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    //  method to find the shortest height
    public int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    //  method to find the tallest height
    public int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
		FootballTeam obj = new FootballTeam();
		
        // Generate random heights for players
        int[] heights = obj.generateRandomHeights(11, 150, 250);

        // Display the heights
        System.out.println("Heights of players (in cms):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
		
		

        // Calculate results
        int sum = obj.calculateSum(heights);
        double mean = obj.calculateMean(heights);
        int shortest = obj.findShortestHeight(heights);
        int tallest = obj.findTallestHeight(heights);

        
        System.out.println("Sum of heights: " + sum + " cms, "+ "\nMean height: " + mean + " cms," + " \nShortest height: " + shortest + " cms" + " \nTallest height: " + tallest + " cms");
      
    }
}