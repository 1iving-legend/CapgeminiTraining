import java.util.Scanner;

public class FriendsComparison {

    public static String findYoungestFriend(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngest = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        return youngest;
    }

    // Method to find the tallest friend based on height
    public static String findTallestFriend(double[] heights, String[] names) {
        double maxHeight = heights[0];
        String tallest = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store the names, ages, and heights of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input for ages and heights of the friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in meters: ");
            heights[i] = sc.nextDouble();
        }

        // Finding the youngest friend
        String youngest = findYoungestFriend(ages, names);

        // Finding the tallest friend
        String tallest = findTallestFriend(heights, names);

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close(); // Close the scanner resource
    }
}
