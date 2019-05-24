package collection;

import java.util.ArrayList;

import model.Student;

public class CollectionsMethods {

	public static void main(String[] args)
	{
		ArrayList arraylist=new ArrayList();
		Student student1,student2;
		student1=new Student(1, "bharath", 550);
		student2=new Student(2, "naresh", 550);
		arraylist.add(student1);
		arraylist.add(student2);
		System.out.println(arraylist.size());
		System.out.println(arraylist.contains(student1));
		System.out.println(arraylist.indexOf(student1));
		System.out.println(arraylist.isEmpty());
		
	}

}
