package p3;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertData
{

	public static void main(String[] args)throws SQLException, IOException 
	{
		DriverManager.registerDriver(new org.h2.Driver());
		Connection con;
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		Statement statement=con.createStatement();
		String v2;
		int v1,v3;
		DataInputStream dis= null;
		dis=new DataInputStream(System.in);
		v1=Integer.parseInt(dis.readLine());
		System.out.println("enter employ id");
		v2=dis.readLine();
		System.out.println("enter employ name");
		
		v3=Integer.parseInt(dis.readLine());
		System.out.println("enter employee salary");
	statement.executeUpdate("insert into employe values("+v1+",'"+v2+"',"+v3+")");
			con.close();
		
		
		 
		}	
		
	

	}


