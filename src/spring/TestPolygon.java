package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Square implements polygon
{
    public void info()
    {
        System.out.print("all sides are equal");
    }
}
class Rectangle implements polygon
{
    public void info()
    {
        System.out.print("two parllel sides are equal");
    }
}
class Cal
{
    polygon polygon;
    public void setPolygon(polygon polygon)
    {
        this.polygon=polygon;
    }
  public  void display()
    {
        polygon.info();
    }
   
}
interface polygon
{
    void info();
    
}

public class TestPolygon 
{
	public static void main(String args[])
	{
		
	
    ApplicationContext container=new ClassPathXmlApplicationContext("a.xml");
Cal cal=(Cal)container.getBean("cal");

cal.display();
	}
}
