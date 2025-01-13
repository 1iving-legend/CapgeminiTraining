import java.util.*;

public class SimpleIntrest{
	public static double intrest(double p, double rate, double time)
	{
            double ans=	p * rate* time/100;
			double roundedValue = Math.round(ans * 10000.0) / 10000.0;
			return roundedValue;
	}
	public static void main(String []args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		double p= sc.nextFloat();
		System.out.println("Enter Rate of Intrest : ");
		double rate= sc.nextFloat();
		System.out.println("Enter Time in year : ");
		double time= sc.nextFloat();
		System.out.println("The Simple Interest is "+intrest(p,rate,time)+"for Principal "+p+"  Rate of Interest "+rate+ " and Time "+time);
	}
}