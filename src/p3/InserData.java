package p3;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InserData {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException 
	{
		DriverManager.registerDriver(new org.h2.Driver());
		Connection con;
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		Statement Statement=con.createStatement();
		int v1;
		System.out.println("enter the empid to be checked");
		ResultSet rs;
		DataInputStream dis=null;
		dis=new DataInputStream(System.in);
		v1=Integer.parseInt(dis.readLine());
		rs=Statement.executeQuery("select * from employe where empid="+v1);		
		if(rs.next())
		{
			System.out.println(rs.getString(2));
		}
	
		else
		{
			System.out.println("data not found");
			
		}
		con.close();
	}

}
