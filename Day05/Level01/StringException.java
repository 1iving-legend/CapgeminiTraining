public class NullPointerExceptionDemo {

    // Method to generate the NullPointerException
    public static void generateException() {
        String text = null;

        System.out.println("Length of the string: " + text.length());
    }

    // Method to handle the NullPointerException
    public static void handleException() {
        String text = null; 

        try {
           
            System.out.println("Length of the string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: The string is null!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");

        // Call the method to generate the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nRefactored code to handle the exception:");

        // Call the method that handles the exception
        handleException();
    }
}
