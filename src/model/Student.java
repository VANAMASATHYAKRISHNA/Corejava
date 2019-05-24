package model;

public class Student {

private	int rollno;
private	String name;
private int marks;
public Student(int i,String n,int m)
{
	rollno=i;
	name=n;
	marks=m;

}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
}