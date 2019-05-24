package collection;

import java.util.ArrayList;

import model.Student;

public class CollectionGenric {

	public static void main(String[] args) 
	{
		ArrayList<Student> arraylist=new ArrayList<Student>();
		Student student1,student2;
		student1=new Student(1, "bharath", 550);
		student2=new Student(2, "naresh", 550);
		arraylist.add(student1);
		arraylist.add(student2);
		for(Student student:arraylist)
		{
			System.out.println(student1.getRollno());
			System.out.println(student1.getName());
			System.out.println(student1.getMarks());
			System.out.println(student2.getRollno());
			System.out.println(student2.getName());
			System.out.println(student2.getMarks());
		}
		

	}

}
