
import java.util.*;

public class StringLength {
    
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String val= sc.next();
	
		int count=0;
		int i=0;
		
		while(true)
		{
			try{
			char s;
			s=val.charAt(i);
			count++;
			i++;
			}
		
		
		   catch(Exception e)
		   {
			System.out.print(count);
			break;
		  }
		}
    }
}
