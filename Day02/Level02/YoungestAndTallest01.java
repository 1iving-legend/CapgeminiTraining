import java.util.Scanner;

public class YoungestAndTallest{

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("Enter height of Amar");
		double heightAmar = input.nextDouble();
		 // Ask the user to enter a number
        System.out.println("Enter height of Akbar");
		double heightAkbar = input.nextDouble();
		 // Ask the user to enter a number
        System.out.println("Enter height of Anthony");
		double heightAnthony = input.nextDouble();
		
		 // Ask the user to enter a number
        System.out.println("Enter age of Amar");
		double ageAmar = input.nextDouble();
		 // Ask the user to enter a number
        System.out.println("Enter age of Akbar");
		double ageAkbar = input.nextDouble();
		 // Ask the user to enter a number
        System.out.println("Enter age of Anthony");
		double ageAnthony = input.nextDouble();
		
		if(heightAmar>heightAkbar && heightAmar >heightAnthony){
			 System.out.println("Amar is tallest");
		}
		else if(heightAkbar>heightAmar && heightAkbar>heightAnthony){
			System.out.println("Akbar is tallest");
		}
		else if(heightAnthony>heightAkbar && heightAnthony>heightAmar){
			System.out.println("Anthony is tallest");
		}
		if(ageAkbar<ageAmar && ageAkbar<ageAnthony){
			System.out.println("Akbar is the youngest");
		}
		else if(ageAmar<ageAkbar && ageAmar<ageAnthony){
			System.out.println("Amar is the youngest");
		}
		else if (ageAnthony<ageAkbar && ageAnthony<ageAmar){
			System.out.println("Anthony is the youngest");
		}
	}
}