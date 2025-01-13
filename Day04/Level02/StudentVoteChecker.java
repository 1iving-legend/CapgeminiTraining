import java.util.Scanner;

public class StudentVoteChecker {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VoteChecker checker = new VoteChecker();

        int[] ages = new int[10];

        // Loop to get the ages of the 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Loop through the array to check if each student can vote
        for (int i = 0; i < 10; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }
        
        sc.close(); // Close the scanner resource
    }
}


public class VoteChecker
{
  // Method to check if the student can vote based on age
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;  // Invalid age, return false
        }
        return age >= 18;  // Return true if age is 18 or above, else false
    }

}
