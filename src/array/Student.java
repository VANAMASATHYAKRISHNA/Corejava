package array;

public class Student
{
	int rollno;
	String name;
	int marks;
public Student(int i,String n,int m)
{
	rollno=i;
	name=n;
	marks=m;
	
}
@Override
public String toString()
{
return ""+rollno+""+name+""+marks;
}
}
