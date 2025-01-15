import java.util.*;


class WordCountString{
	
	
	//method to count length
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
	
	
	
	
	
	
	
	
//method to cnvert string to array
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
	
	
	//method to find length of each string value in a string array
	public static String[][] methodTable(String []arr)
	{
		String res[][]= new String[arr.length][2];
		 for(int i=0;i<arr.length;i++)
		  {
		       res[i][0]=arr[i]; 
			   int temp= countLen(arr[i]);
			   String val= String.valueOf(temp);
			   res[i][1]=val; 
		  }
		  return res;
	}


		
		
     public static void main(String[]args){
		
		Scanner sc= new Scanner(System.in);
		  System.out.println("Enter text");
		  String text= sc.nextLine();
		  
		  String[] arr=splitz(text);
		  String [][] res= new String[arr.length][2];
		 res= methodTable(arr);
		  
		  System.out.println("Text\tlength");
		  
		   for(int i=0;i<arr.length;i++)
		  {
		        System.out.println(res[i][0] + "\t" + Integer.parseInt(res[i][1]));
		  }
		  
    }
}