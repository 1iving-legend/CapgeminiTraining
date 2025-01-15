
import java.util.*;

public class SubStringCompare {
    
	public static String FindSubString(String s1, int start, int end)
	{
		String res="";
		for(int i= start; i<end;i++)
		{
			res+=s1.charAt(i);
		}
		return res;
	}
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter  string : ");
       String s1= sc.nextLine();
	   System.out.println("Enter Start Index : ");
	    int start= sc.nextInt();
		 System.out.println("Enter End Index : ");
	    int end= sc.nextInt();
		
		String varForCharAtMethod= FindSubString( s1, start,  end);
		String varForSubstringMethod= s1.substring(start,end);
		System.out.println("Substring through charAt method : "+varForCharAtMethod);
		System.out.println("Substring through subString method : "+varForSubstringMethod);
		
		
    }
}
