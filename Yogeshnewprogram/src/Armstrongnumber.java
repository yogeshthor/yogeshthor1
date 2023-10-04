

// palindrome  Number   not arm strong 

public class Armstrongnumber {

	public static void main(String[] args)   
	{  
	int number = 123, reverse = 0; 
	int  armstrong =number ;
	while(number != 0)   
	{  
	int remainder = number % 10;  
	  reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	
	if (armstrong == reverse)
	{
		System.out.println("Number is Palindrome");
	}
	else
	{
		System.out.println("Number is not Palindrome");
	}
	
	}  
	}  

