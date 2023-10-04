
public class PrimeNumber                     

{
    public static void main(String[] args)
    {
        int n = 77;
        boolean prime = true; 
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            
                prime = false;
                break;
            
        }
        if (prime==true)
        System.out.println("Given number is Prime");
        else
            System.out.println("Given number is not Prime");
        	
    }
   
}