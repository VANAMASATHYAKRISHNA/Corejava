package statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employ {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new org.h2.Driver());
		Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		Statement statement= connection.createStatement();
		ResultSet rs;
	rs=	statement.executeQuery("select * from employe");
		rs.next();
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));

	}

}
