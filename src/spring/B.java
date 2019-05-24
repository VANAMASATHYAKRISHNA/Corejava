package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
interface A
{
void m1();	 
}
 class E implements A
{
	public void m1()
	{
		System.out.println("form B m1");
	}

}
  class C implements A
{
	public void m1() {
		System.out.println("form c m1");
	}
}
 
 class D 
 {
	A abc;
	public void setAbc(A b)
	{
		this.abc=b;
	}
 }
public class B
{
	public static void main(String args[])
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("B.xml");
		D d=(D)container.getBean("d");
		d.abc.m1();
		
	}
}