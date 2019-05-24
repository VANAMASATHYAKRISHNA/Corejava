package p3;
import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Student
{
int rollno;
String name;
int marks;
void info() throws NumberFormatException, IOException
{
	DataInputStream dis=null;
	dis=new DataInputStream(System.in);
	
	int v1=Integer.parseInt(dis.readLine());
	String v2=dis.readLine();
	int v3=Integer.parseInt(dis.readLine());
	rollno=v1;
	name=v2;
	marks=v3;
}
}
public class Test {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException
	{
		Student s1=new Student();
		s1.info();
		DriverManager.registerDriver(new org.h2.Driver());
		Connection connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into Student values("+s1.rollno+",'"+s1.name+"',"+s1.marks+")");
		connection.close();
	}

}
