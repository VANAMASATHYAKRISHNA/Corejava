package p3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc 
    {

	public static void main(String[] args) throws SQLException
	{
		DriverManager.registerDriver(new org.h2.Driver());
	Connection con;
	con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
	Statement Statement=con.createStatement();
	ResultSet rs;
	rs=Statement.executeQuery("select * from student");		
	rs.next();
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getInt(3));
	rs.next();
	
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getInt(3));
	con.close();

	

	}

}
