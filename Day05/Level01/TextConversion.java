import java.util.*;

public class TextConversion {

    public static String convertToUpper(String text) {
        StringBuilder upperText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperText.append((char) (ch - 32)); // Convert to uppercase
            } else {
                upperText.append(ch); // Keep non-lowercase characters as is
            }
        }
        return upperText.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the text:");
        String inputText = scanner.nextLine();

        
        String builtInUppercase = inputText.toUpperCase();

        
        String toUppercase = convertToUpper(inputText);

      
        boolean isEqual = compareStrings(builtInUppercase, toUppercase);

        System.out.println("Built-in Uppercase: " + builtInUppercase);
        System.out.println("Custom Uppercase: " + toUppercase);
        System.out.println("Are both conversions equal? " + isEqual);

        scanner.close();
    }
}
