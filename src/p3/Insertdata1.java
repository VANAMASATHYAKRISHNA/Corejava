package p3;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata1 {

	public static void main(String[] args) throws SQLException,IOException 
	{
		DriverManager.registerDriver(new org.h2.Driver());
		Connection connection;
		connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		String v2;
		int v1,v3;
		DataInputStream dis= null;
		dis=new DataInputStream(System.in);
		System.out.println("enter employe id");
		v1=Integer.parseInt(dis.readLine());
		System.out.println("enter employe name");
		v2=dis.readLine();
		System.out.println("enter employe salary");
		v3=Integer.parseInt(dis.readLine());
		PreparedStatement preparedstatement=connection.prepareStatement("insert into employe values(?,?,?)");
		preparedstatement.setInt(1, v1);
		preparedstatement.setString(2, v2);
		preparedstatement.setInt(3, v3);
		preparedstatement.executeUpdate();
		connection.close();
		

	}

}
