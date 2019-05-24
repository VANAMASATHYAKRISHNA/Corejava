package array;

public class Arrayexamle {

	public static void main(String[] args) {
		Object object[]=new Object[20];
		object[0]=1;
		object[1]="bharath";
		object[2]=25.5f;
		object[3]=27.5;
		object[4]=new Student(1,"bharath",90);
		 for(Object o:object)
	        {
	        	if(o instanceof Integer)
	        	{
	        		
	        		System.out.println(o);
	        	
	        }
	        	if(o instanceof String)
	        	{
	        		
	        		System.out.println(o);
	        	
	        		
	        	}
	        	if(o instanceof Float)
	        	{
	        		
	        		System.out.println(o);
	        	
	        		
	        	}
	        	if(o instanceof Float)
	        	{
	        		
	        		System.out.println(o);
	        	
	        		
	        	}
	        	if(o instanceof Student)
	        	{
	        		Student s=(Student)o;
	        		System.out.println(s.name);
	        		System.out.println(s.rollno);
	        		System.out.println(s.marks);
	        	
	        }
	        	
	        }
		}

	}
