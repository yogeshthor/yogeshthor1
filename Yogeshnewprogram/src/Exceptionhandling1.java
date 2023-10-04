
public class Exceptionhandling1 {

	public static void main(String[] args) {
		int e =0;
		int a =12;
		System.out.println("Value of A = "+a);
		int c = a * 2;
		System.out.println("Value of C = "+c);
		int d = a% 2;
		System.out.println("Value of D = "+d);
		try
		{
		 if (c == 24)
			throw new Exception("Not Good number");
		}
		catch(Exception u)
		{
		System.out.println(u.getMessage());	
		}
		finally {
			System.out.println("Fianlly");
		}
		System.out.println("Value of E = "+e);
	}

}
