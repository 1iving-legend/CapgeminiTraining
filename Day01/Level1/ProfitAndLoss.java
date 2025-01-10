/*
Create a program to calculate the profit and loss in number and percentage based on
the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/

class Main{

public static void main(String [] args)
{
	// created variables costPrice and sellPrice and assigned value to them
    double costPrice=129;
	double sellPrice=191;
	 double profit= sellPrice-costPrice; //profit calculation
	 double profitPercent= profit*100.0/costPrice; //profit percentage calculated
	
	System.out.println("The Profit is INR "+profit +" and the Profit Percentage is "+ Math.round(profitPercent*100.0)/100.0);
}

}