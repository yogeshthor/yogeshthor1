import java.sql.*;
import java.sql.Connection;


class Createtable {

	

	public static void main(String[] args) {
		
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		 
		String url="jdbc:mysql://localhost:3306/yogesh";
		String username="root";
		String password="root";
		
		String q = "create table table2(tId int(20)primary key auto_increment,tName varchar(200)not null, tcity varchar(400))";
		try (
		Connection con=DriverManager.getConnection(url,username,password);
			 
		//create statement 
		Statement stmt=con.createStatement();
		)
		{
		stmt.executeUpdate(q);
				
	     System.out.println("table created in database..." );
		   
		}
	

		
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
  }
}
