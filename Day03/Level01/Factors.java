import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int temp = 10;              // Initial size of the array
        int[] arr = new int[temp];  // Array to store factors
        int index = 0;              // Tracks the number of factors stored

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                // Resize the array dynamically if needed
                if (index == temp) {
                    temp *= 2;  // Double the size
                    int[] newArr = new int[temp];
                    for(int k=0;k<index;k++)
					{
						newArr[k]=arr[k];
					}
                    arr = newArr;
                }
                // Add the factor to the array
                arr[index++] = i;
            }
        }

        System.out.println("Factors are:");
        for (int i = 0; i < index; i++) {  // Only print valid elements
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
