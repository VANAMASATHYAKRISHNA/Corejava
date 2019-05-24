package collection;

import java.util.ArrayList;
import java.util.Iterator;

import model.Employee;
import model.Student;

public class CollectionExample {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		Student student1,student2;
		student1=new Student(1, "bharath", 550);
		student2=new Student(2, "naresh", 550);
		Employee employee1,employee2;
		employee1=new Employee(101, "hari", 25000);
		employee2=new Employee(102, "haritha", 52000);
		arraylist.add(student1);
		arraylist.add(student2);
		arraylist.add(employee1);
		arraylist.add(employee2);
		Iterator iterator=arraylist.iterator();
		
		while(iterator.hasNext())
        {
            
            Object object=iterator.next();
            if(object instanceof Student)
            {
                Student s=(Student)object;
                System.out.print(s.getRollno());
                System.out.print(s.getName());
                System.out.println(s.getMarks());
                System.out.println("--------------------------");
            }else
                if(object instanceof Employee)
                {
                    Employee e=(Employee)object;
                    System.out.print(e.getId());
                    System.out.print(e.getName());
                    System.out.println(e.getSalary());
                    System.out.println("--------------------------");
                }
                
        }
	}
}


