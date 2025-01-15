
import java.util.*;

public class StringCompare {
    
	public static boolean compare(String s1, String s2)
	{
		return s1.equals(s2);
	}
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
       String s1= sc.nextLine();
	   System.out.println("Enter Secound string : ");
	    String s2= sc.nextLine();
		
		if(s1.length()!=s2.length()){
		  System.out.println("String is not equal ");
		}
		
		else
		{
			int count =0;
		   for(int i=0; i<s1.length();i++)
		   {
			   if(s1.charAt(i)==s2.charAt(i))
			   {
				   count++;
			   }
			   else{
				   System.out.println("String is not equal ");
				   break;
			   }
		   }
		   if(count==s1.length())
		   {
			   System.out.println("String is equal ");
		   }
		   else{
			   System.out.println("String is not equal ");
		   }
		}
		
		if(!compare(s1,s2))
		{
			 System.out.println("String is not equal by compare method ");
		}
		else{
			System.out.println("String is equal by compare method ");
		}
    }
}
