import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Initialize a 2D array to store marks (rows = students, columns = subjects)
        int[][] marks = new int[numStudents][3]; // [numStudents][3 subjects: Physics, Chemistry, Math]
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for each student's marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Enter marks in Physics: ");
            marks[i][0] = scanner.nextInt(); // Column 0 = Physics
            while (marks[i][0] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                marks[i][0] = scanner.nextInt();
            }

            System.out.print("Enter marks in Chemistry: ");
            marks[i][1] = scanner.nextInt(); // Column 1 = Chemistry
            while (marks[i][1] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                marks[i][1] = scanner.nextInt();
            }

            System.out.print("Enter marks in Math: ");
            marks[i][2] = scanner.nextInt(); // Column 2 = Math
            while (marks[i][2] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                marks[i][2] = scanner.nextInt();
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results
        System.out.println("\nResults:");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-10s%n", "Student", "Physics", "Chemistry", "Math", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d%-15d%-15d%-15d%-15.2f%-10s%n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
