import java.util.*;

public class Temperature{
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in fahrenheit : ");
		double fahrenheit= sc.nextDouble();
		double celsius=(fahrenheit-32)*5/9;
		System.out.println("The "+fahrenheit+ " fahrenheit is "+celsius+ " celsius");
	}
}