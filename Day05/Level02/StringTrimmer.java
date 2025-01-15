import java.util.Scanner;

public class StringTrimmer {

   
    public static String trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

      
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

       
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

      
        return str.substring(start, end + 1);
    }

   
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // Main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String str = input.nextLine();

      
        String trimmedByMethod = trimSpaces(str);

      
        String trimmedByBuiltIn = str.trim();

        boolean areEqual = compareStrings(trimmedByMethod, trimmedByBuiltIn);

      
        System.out.println("Trimmed by custom method: '" + trimmedByMethod + "'");
        System.out.println("Trimmed by built-in method: '" + trimmedByBuiltIn + "'");
        System.out.println("Are the two results equal? " + areEqual);

        input.close();
    }
}