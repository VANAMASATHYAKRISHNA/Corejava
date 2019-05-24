package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Wish 
{
	String msg;

	public void setmsg(String msg)
		{
this.msg=msg;		
}

	
}

 public class Sample {

	public static void main(String[] args) 
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("wish.xml"); 
		Wish wish=(Wish)container.getBean("Wish");
        System.out.println(wish.msg);
		
		

	}

}
