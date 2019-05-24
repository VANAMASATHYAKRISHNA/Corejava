package model;

public class Employee {
	private int id;
	private String name;
	private int salary;
	public Employee(int e,String n,int s)
	{
	id=e;
	name=n;
	salary=s;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
