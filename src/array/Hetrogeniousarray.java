package array;

public class Hetrogeniousarray {

	public static void main(String[] args) {
		
			Object object[]=new Object[20];

			object[0]=12;
			object[1]=12.56;
			object[2]=new Student(102,"hello",567);
			object[3]="abc";


			for(Object  obj: object)
			{
			    if(obj instanceof Integer)
			    {
			        System.out.println("Intger"+obj);
			        
			    }
			    else
			    if(obj instanceof String)
			    {
			        System.out.println("String"+obj);
			    }
			    else
			    if(obj instanceof Float)
			    {
			        System.out.println("Float"+obj);
			    }
			    else
			        if(obj instanceof Student)
			        {
			            Student s=(Student)obj;
			            System.out.println("rollno = "+s.rollno);
			            System.out.println("name"+s.name);
			            System.out.println("marks"+s.marks);
			            
			        }
			        else
			    {
			        System.out.println("else "+obj);
			    }
			    }

			        
			    }

			
	}


