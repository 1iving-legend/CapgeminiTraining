import java.util.Scanner;

class AllMultiple{
    public static void main(String[] args){
	 
	 Scanner sc=new Scanner(System.in);
	 
	 //take user input
	System.out.println("enter the no");
	  int n=sc.nextInt();
	
	
	

	for(int i=n;i<=100;)
	{
	
	System.out.println(i);
       i+=n;

	}

	
	
	
	
	 sc.close();
	}
}