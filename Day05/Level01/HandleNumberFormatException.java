import java.util.Scanner;


class HandleNumberFormatException{
	public static void generateException(String text){
		System.out.println(Integer.parseInt(text));
		}
	
	public static void handleException(String text){
		
		
         try {
            System.out.println("Attempting to call a method  NumberFormatException...");
            generateException(text); 
        } catch ( NumberFormatException e) {
            System.out.println("Caught a  NumberFormatException: " + e.getMessage());
            System.out.println("The object 'text' not found in string  and cannot be accessed.");
        }
    }

		
     public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text");
		String text=sc.nextLine();
		 handleException(text);
		
		 try {
            generateException(text); // This will throw and stop the program
        } catch ( NumberFormatException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }

        
    }
}