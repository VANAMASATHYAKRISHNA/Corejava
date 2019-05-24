package preparedstatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new org.h2.Driver());
		Connection connection;
		connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");
		int v1=32;
		int v3=95;
		String v2="sathya";
		preparedStatement.setInt(1, v1);
		preparedStatement.setString(2, v2);
		preparedStatement.setInt(3, v3);
		preparedStatement.executeUpdate();
		

	}

}
