
import java.util.*;

public class   CharArray{
    
	public static char[] returnAllChar(String s1)
	{
		char []res= new char[s1.length()];
		for(int i= 0; i<s1.length();i++)
		{
			res[i]=s1.charAt(i);
		}
		return res;
	}
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter  string : ");
		String val= sc.nextLine();
        char []m= new char[val.length()];
		char []arr= new char[val.length()];
		arr = returnAllChar(val);
		m= val.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(m));
		boolean flag=true;
		for(int i=0;i<val.length();i++)
		{
			if(arr[i]!=m[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("both are equal");
		}
		else
		{
						System.out.println("both are not equal");
		}
		
    }
}
