package p3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
class Student1
{
	int rollno,marks;
	String name;
}

public class Studentarry {

	public static void main(String[] args) throws SQLException {
		Student1 s1;
		s1= new Student1();
		DriverManager.registerDriver(new org.h2.Driver());
		Connection connection;
		connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from student ");
	    ResultSet rs;
		rs=preparedStatement.executeQuery();
		if(rs.next())
		{
	int p=(rs.getInt(1));
	String s=(rs.getString(2));
	int t=(rs.getInt(3));
	s1.rollno=p;
	s1.name=s;
	s1.marks=t;

System.out.println("Student rollno="+p);
System.out.println("Student name="+s);
System.out.println("Student marks="+t);
	}

}
}