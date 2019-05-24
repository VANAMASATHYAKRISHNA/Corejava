package array;

public class Casting {

	public static void main(String[] args) 
	{
		Object[] object=new Object[2];
		Student student=new Student(1,"bharath",90);
        Employee employee=new Employee(1,"Naresh",60000);
        object[0]=student;
        object[1]=employee;
        for(Object o:object)
        {
        	if(o instanceof Student)
        	{
        		Student s=(Student)o;
        		System.out.println(s.name);
        		System.out.println(s.rollno);
        		System.out.println(s.marks);
        	
        }
        	if(o instanceof Employee)
        	{
        		Employee em=(Employee)o;
        		System.out.println(em.name);
        		System.out.println(em.id);
        		System.out.println(em.salary);
        	
        		
        	}
        	
        }
	}

}
