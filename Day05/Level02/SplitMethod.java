import java.util.Scanner;

class SplitMethod {
	
	
	public static int countLen(String val)
	{
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
			
			break;
		  }
		}
		
		return count;
		
	}
	
	
	
	
	
	
	
	

    public static String[] splitz(String val) {
        int count = 0;
        for (int i = 0; i < countLen( val); i++) {
            if (val.charAt(i) == ' ') {
                count++;
            }
        }

       
        String[] res = new String[count + 1];
        int index = 0;
        String ele = "";

        
        for (int i = 0; i <countLen(val); i++) {
            if (val.charAt(i) == ' ') {
                res[index++] = ele; 
                ele = "";          
            } else {
                ele += val.charAt(i); 
            }
        }

   
        res[index] = ele;

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

       
        String[] arr = splitz(text);

      
        System.out.println("Split words:");
        for (String ele : arr) {
            System.out.println(ele);
        }
    }
}
