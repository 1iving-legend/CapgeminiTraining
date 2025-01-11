import java.util.Scanner;

public class CheckEvenOddNegAndZero{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);;
		int[] numbersArr = new int[5];
		System.out.println("Enter 5 numbersArr");
		
		//loop from 0 to 5 i.e studentAges array length
		for(int i =0; i<5; i++){
			
			numbersArr[i] = input.nextInt(); //taking Student age as input	
		}
		//check each element in the array
		for (int i=0; i<5; i++){
			
			if(numbersArr[i] > 0)
			{
				if(numbersArr[i]%2==0){
				System.out.println("number is even "+ numbersArr[i]); // checking if it is even 
				}else{
				System.out.println("number is odd "+ numbersArr[i]); // checking if it is odd 
				}
			}
			else if(numbersArr[i] <0 ){
				System.out.println("Number is negative "+ numbersArr[i]); // checking if it is negative 
			}else if(numbersArr[i] == 0){
				System.out.println("Number is zero " + numbersArr[i]); // checking if it is zero 
			}
		}
		//compare first and last element
		if(numbersArr[0] > numbersArr[4])
		{
			System.out.println("First "+numbersArr[0]+" number is greater than last number "+ numbersArr[4]+" of array"); // checking if it is first no is greater than last 
		}
		else if(numbersArr[0] < numbersArr[4])
		{
			System.out.println("First "+numbersArr[0]+" number is ;ess than last number "+ numbersArr[4]+" of array"); // checking if it is first no is less than last 
		}
		else
		{
			System.out.println("First "+numbersArr[0]+" number is equal to the last number "+ numbersArr[4]+" of array"); // checking if it is first no is equal to the last 
		}
	
		input.close();
		
	}

}