import java.util.Scanner;

public class VoteEligibility{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);;
		int[] studentAges = new int[10];
		System.out.println("Enter 10 students age : ");
		
		//loop from 0 to 10 i.e studentAges array length
		for(int i =0; i<10; i++){
			
			studentAges[i] = input.nextInt(); //taking Student age as input
			
		}
		//check if student can give vote or not
		for(int i=0; i<10; i++){
			if(studentAges[i]<0){
				System.out.println("Invalid age "+ studentAges[i]);
			}else if(studentAges[i]>=18){
				System.out.println("The student with the age "+studentAges[i] + " can vote");
			}else{
				System.out.println("The student with the age "+studentAges[i] + " cannot vote");
			}
			
			
		}
		input.close();
		
	}

}