import java.util.*;

public class CalculateGrade {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate random scores for Physics, Chemistry, and Math
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        sc.close();
    }

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Physics
            scores[i][1] = 10 + random.nextInt(90); // Chemistry
            scores[i][2] = 10 + random.nextInt(90); // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // [total, average, percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\t\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "\t");

            // Determine the grade
            double percentage = results[i][2];
            if (percentage >= 80) {
                System.out.println("A (Level 4, above agency-normalized standards)");
            } else if (percentage >= 70) {
                System.out.println("B (Level 3, at agency-normalized standards)");
            } else if (percentage >= 60) {
                System.out.println("C (Level 2, below but approaching agency-normalized standards)");
            } else if (percentage >= 50) {
                System.out.println("D (Level 1, well below agency-normalized standards)");
            } else if (percentage >= 40) {
                System.out.println("E (Level 1-, too below agency-normalized standards)");
            } else {
                System.out.println("R (Level 4, Remedial standards)");
            }
        }
    }
}
