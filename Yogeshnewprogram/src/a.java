class Parent 
   {
	void play()
	{
		System.out.println("Form Parent");
	}
   }
   
class Child extends Parent
   {
	void play()
	{
	System.out.println("Form Child");
	}
     public static void main(String[]args)
	{
		Child c1= new Child();
		c1.play();
	}

    }
