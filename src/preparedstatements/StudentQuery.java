package preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentQuery {

	public static void main(String[] args) throws SQLException
	{
		DriverManager.registerDriver(new org.h2.Driver());
		Connection connection;
		connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from student ");
	    ResultSet rs;
		rs=preparedStatement.executeQuery();
		while(rs.next())
		{
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getInt(3));
	
		}
	}

}
