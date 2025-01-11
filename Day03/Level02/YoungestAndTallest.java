import java.util.Scanner;

public class YoungestAndTallest{

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
       int heightArr[] = new int[3];
	   for(int i=0;i<3;i++)
	   {
		    heightArr[i]=input.nextInt();
	   }
	   int AgeArr[] = new int[3];
	    for(int i=0;i<3;i++)
	   {
		    AgeArr[i]=input.nextInt();
	   }
	   
	   int heightAmar=heightArr[0];
	   int heightAkbar=heightArr[1];
	   int heightAnthony=heightArr[2];
	   int ageAmar=heightArr[0];
	   int ageAkbar=heightArr[1];
	   int ageAnthony=heightArr[2];
		
		
		
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