import java.util.Scanner;
class Oddeven {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter Number");
		Scanner scr   = new Scanner(System.in);
		  n = scr.nextInt();
		  
		  if(n%2==0)
		  {
			  System.out.println("Even Number");
			  
		  }
		  else
			 
		  {
			  System.out.println("odd Number");
		  }
	}	
}
