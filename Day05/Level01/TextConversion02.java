import java.util.*;

public class TextConversion02 {

    public static String convertToLower(String text) {
        StringBuilder lowerText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerText.append((char) (ch + 32)); 
            } else {
                lowerText.append(ch);
            }
        }
        return lowerText.toString();
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

        
        String builtInLowercase = inputText.toLowerCase();

        
        String toLowercase = convertToLower(inputText);

      
        boolean isEqual = compareStrings(builtInLowercase, toLowercase);

        System.out.println("Built-in Lowercase: " + builtInLowercase);
        System.out.println("Custom Lowercase: " + toLowercase);
        System.out.println("Are both conversions equal? " + isEqual);

        scanner.close();
    }
}
