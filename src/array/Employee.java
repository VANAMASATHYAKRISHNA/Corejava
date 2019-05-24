package array;

public class Employee
{
	int id;
	String name;
	int salary;
	public Employee(int e,String n,int s)
	{
	id=e;
	name=n;
	salary=s;
	}
@Override
public String toString()
{
	return""+id+""+name+""+salary;
}
}
