package p3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
class Student2
{
	int rollno,marks;
	String name;
}

public class Student5 {

	public static void main(String[] args) throws SQLException {
		Student2 s1;
		Student2 studentdata[]=new Student2[20];
		
		DriverManager.registerDriver(new org.h2.Driver());
		Connection connection;
		connection=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/sathkrh","sa","sa");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from student ");
	    ResultSet rs;
		rs=preparedStatement.executeQuery();
		int i=0;
		while(rs.next())
		{
			 s1= new Student2();
	s1.rollno=(rs.getInt(1));
	s1.name=(rs.getString(2));
	s1.marks=(rs.getInt(3));
	studentdata[i]=s1;
	i++;
		}
		System.out.println(studentdata[0]+""+studentdata[1]+""+studentdata[2]+""+studentdata[3]+""+studentdata[4]);
/*for(int j=0;j<5;j++)
{
System.out.println(s[j].rollno+"  "+s[j].name+"  "+s[j].marks);	
}*/
		for (Student2 stu:studentdata)
		{
			if(stu==null)
			{
				
			}
		}
}

}

