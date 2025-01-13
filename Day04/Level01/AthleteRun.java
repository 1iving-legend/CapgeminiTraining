import java.util.Scanner;

public class  AthleteRun{
	
		public static double noOfRounds(double s1, double s2, double s3)
	{
          double perimeter = s1 + s2 + s3;
        return  5000.0 / perimeter;
	}
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1, side2, side3, perimeter;
        System.out.print("Enter the length of side1 (in meters): ");
        side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        side2 = scanner.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        side3 = scanner.nextDouble();

        double rounds=noOfRounds(side1, side2, side3);

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        scanner.close();
    }
}