/*
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/
import java.util.*;

public class KilometersToMiles{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		double fee= sc.nextDouble();
		double discountPercent= sc.nextDouble();
		double discount=(discountPercent/100.0)*fee;
		double discoutedFee = fee- discount;
		
		System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR "+discoutedFee);
	}
}