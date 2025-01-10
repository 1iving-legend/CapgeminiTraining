/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km
*/


import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1, side2, side3, perimeter;
        System.out.print("Enter the length of side1 (in meters): ");
        side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        side2 = scanner.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        side3 = scanner.nextDouble();

        perimeter = side1 + side2 + side3;
        double rounds = 5000.0 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        scanner.close();
    }
}