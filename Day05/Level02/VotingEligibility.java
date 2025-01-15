import java.util.Random;

public class VotingEligibility {

   
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) - 10; 
        }

        return ages;
    }

    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = Integer.toString(age);

            if (age < 0) {
                results[i][1] = "Cannot Vote (Invalid Age)";
            } else if (age >= 18) {
                results[i][1] = "True (Can Vote)";
            } else {
                results[i][1] = "False (Cannot Vote)";
            }
        }

        return results;
    }


    
	public static void displayResults(String[][] results) {
		
		System.out.println("Age       | Voting Eligibility");
		System.out.println("-------------------------------");

		
		for (String[] row : results) {
			System.out.println(row[0] + "        | " + row[1]);
		}
	}


    public static void main(String[] args) {
        int numberOfStudents = 10;

      
        int[] ages = generateAges(numberOfStudents);

       
        String[][] votingResults = checkVotingEligibility(ages);

        displayResults(votingResults);
    }
}