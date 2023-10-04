import java.sql.*;
class FirstJDBC 
{
	public static void main(String args[])
	{
	try
		{
			//load the driver :
			Class.forName("com.mysql.jdbc.Driver");
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/yogesh";
			String username="root";
			String password="root";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			if(con.isClosed())
			{
				System.out.println("connestion is closed");
			}else
			{
				System.out.println("connection Created...");
			}
		}
			
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
      }
	
	
}