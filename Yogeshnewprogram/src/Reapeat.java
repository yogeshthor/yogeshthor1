
public class Reapeat {

	
	public Reapeat () {
		System.out.println("Hello Constructor");
	}
	
	public Reapeat (int a) {
		System.out.println(" Parameter Constructor");
		
	}
	
	
	
	public int add() 
	{
		int a;int b;int c;
		a=10;
	    b=20;
       c =a+b;
      return c;
	}
       
	public int add(int a, int b) 
	{
	int c;
       c =a+b;
      return c;
     
	}
	public int sub() 
	{
		int a;int b;int c;
		a=10;
	    b=20;
        c =a-b;
      return c;
	}
	
	public int sub(int a, int b) 
	{
	int c;
       c =a-b;
      return c;
     
	}
	public int mul() 
	{
		int a;int b;int c;
		a=10;
	    b=20;
        c =a*b;
      return c;
	}
	public int mul(int a, int b) 
	{
	int c;
       c =a*b;
      return c;
     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Reapeat r1 =new Reapeat();
        Reapeat r2 =new Reapeat(0);
        System.out.println(r1.add());
        System.out.println(r1.add(5,11));
        System.out.println(r1.sub());
        System.out.println(r1.sub(5,11));
        System.out.println(r1.mul());
        System.out.println(r1.mul(5,11));
	}

}
