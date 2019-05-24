package statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new org.h2.Driver());
		  Connection con;
		  con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
			Statement Statement=con.createStatement();
			Statement.executeUpdate("insert into student values(1,'haresh',50)");
			con.close();
	}

}
