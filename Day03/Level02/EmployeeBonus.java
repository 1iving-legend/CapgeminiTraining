import java.util.Scanner;

public class EmployeeBonus {

    // Method to calculate bonus based on salary and years of service
    public static double calculateBonus(double salary, double years) {
        return years >= 5 ? salary / 20.0 : salary / 50.0;
    }

    public static void main(String[] args) {
        // Variables to store total calculations
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner sc = new Scanner(System.in);

        // Array to hold salary and years of service for 10 employees
        double[][] employeeData = new double[10][2];

        // Input salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            while (true) {
                double salary = sc.nextDouble();
                double years = sc.nextDouble();

                if (salary > 0 && years > 0) {
                    employeeData[i][0] = salary;
                    employeeData[i][1] = years;
                    break;
                } else {
                    System.out.println("Invalid input. Salary and years must be positive. Try again:");
                }
            }
        }

        // Array to store bonuses and calculations
        double[][] bonusData = new double[10][2];

        // Process each employee's data
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = calculateBonus(salary, years);

            bonusData[i][0] = salary; // Old salary
            bonusData[i][1] = bonus; // Bonus amount

            totalBonus += bonus;
            totalOldSalary += salary;
        }

        // Calculate new salaries and total new salary
        double[] newSalaries = new double[10];
        for (int i = 0; i < 10; i++) {
            newSalaries[i] = bonusData[i][0] + bonusData[i][1];
            totalNewSalary += newSalaries[i];
        }

        // Output individual bonuses
        System.out.println("\nEmployee Salary and Bonus Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f\n", 
                i + 1, bonusData[i][0], bonusData[i][1]);
        }

        // Output total calculations
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }
}
