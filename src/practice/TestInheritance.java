package practice;
class Polygon
{
	void info()
	{
		System.out.println("closed container");
	}
}
class Rectangle extends Polygon
{
void info()
{
	System.out.println("oppsite sides are equal");
}
}


public class TestInheritance {

	public static void main(String[] args) 
	{
		Rectangle rectangle=new Rectangle();
		Polygon polygon=new Polygon();
		rectangle.info();
         polygon.info();
	}

}
